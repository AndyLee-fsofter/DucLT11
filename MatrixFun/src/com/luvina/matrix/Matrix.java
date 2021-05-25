package com.luvina.matrix;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Matrix {
	private int matrix[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9}, 
								{ 7, 8, 2, 3, 6, 4, 3, 2 }, 
								{ 8, 9, 3, 2, 4, 3, 4, 9 },
								{ 0, 4, 7, 3, 4, 2, 3, 4 },
								{ 9, 8, 7, 4, 3, 2, 3, 8 }, 
								{ 8, 7, 3, 4, 3, 3, 2, 3 },
								{ 9, 7, 4, 5, 4, 1, 8, 3 }, 
								{ 9, 8, 4, 3, 7, 5, 9, 8 } };

	public void secondMax() {
	/*
	 * cách này ta sẽ sắp xếp từng mảng sau đó so sánh giá trị lớn nhất của từng mảng hàng
	 * tuy nhiên cách này có nhiều hạn chế và chưa tối ưu trong trường hợp các giá trị lớn nhất của từng mảng
	 * bằng nhau
	 * */	
//		for (int i = 0; i < matrix.length; i++) {
//			
//				Arrays.sort(matrix[i]);
//				System.out.println(Arrays.toString(matrix[i]));			
//			}
//		int max = matrix[matrix.length - 1][matrix.length - 1];
//		int secondMax = 0;
//		for (int i = matrix.length-1; i >=0; i--) {
//			if(matrix[matrix.length-1][matrix.length-1] > max){
//			secondMax = max;
//			matrix.length-1][matrix.length-1] = max;
//			}
//		}
		
		/*
		 * đây là cách duyệt từng phần tử trong ma trận để tìm ra số lớn thứ hai
		 * */
		int max = matrix[0][0];
		int secondMax = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j]>max) {
					secondMax = max;
					max = matrix[i][j];
				}
			}
		}
		System.out.println("giá trị lớn thứ 2 trong ma trận là " +secondMax);
	}

	public void calcSumArea() {
		/*
		 * thuật toán: trong ma trận thì các phần tử thuộc tam giác trên sẽ có i > j các
		 * phần tử thuộc tam giác dưới có i < j các phần tử thuộc tam giác trên tạo bởi
		 * đường chéo phụ sẽ có i + j < length -1 các phần tử thuộc tam giác dưới tạo
		 * bởi đường chéo phụ sẽ có i + j > length -1 khi đó ta sẽ lấy ra các tam giác
		 * nhỏ bằng các kết hợp cả 2 đường chéo
		 */
		// vì là ma trận vuông nên ta có thể thấy số dòng số cột là bằng nhau
		// vòng for thứ nhất duyệt hàng

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int i = 0; i < matrix.length; i++) {
//			vòng for thứ 2 duyệt cột
			for (int j = 0; j < matrix.length; j++) {
//				kết hợp các điều kiện để lấy ra các phần tử thuộc tam giác cần chọn và cộng vào tổng
				if (i > j && i + j < matrix.length - 1) {
					sum1 += matrix[i][j];
				}

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
//				kết hợp các điều kiện để lấy ra các phần tử thuộc tam giác cần chọn và cộng vào tổng
				if (i < j && i + j < matrix.length - 1) {
					sum2 += matrix[i][j];
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
//				kết hợp các điều kiện để lấy ra các phần tử thuộc tam giác cần chọn và cộng vào tổng
				if (i > j && i + j > matrix.length - 1) {
					sum3 += matrix[i][j];
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
//				kết hợp các điều kiện để lấy ra các phần tử thuộc tam giác cần chọn và cộng vào tổng
				if (i < j && i + j > matrix.length - 1) {
					sum4 += matrix[i][j];
				}

			}
		}
		System.out.println("tổng các phần tử của tam giác thứ nhất là :" + sum1);
		System.out.println("tổng các phần tử của tam giác thứ hai là :" + sum2);
		System.out.println("tổng các phần tử của tam giác thứ ba là :" + sum3);
		System.out.println("tổng các phần tử của tam giác thứ tư là :" + sum4);
	}
	
	public int findMax(int[] intArr) {
		Arrays.sort(intArr);
		int Max = intArr[intArr.length-1];
		return Max;
	}
	
	public int findSecondMax(int[] intArr) {
		Arrays.sort(intArr);
		int secondMax = intArr[intArr.length-2];
		return secondMax;
	}
	
	public int getIndex(int a, int[] intArr) {
		int i = 0;
		for (; i < intArr.length; i++) {
			if(a == intArr[i]);
			break;
		}
		return i;
	}
	
	public void maxDiagonalLine() {
		int[][] matrix = this.matrix;
		for (int i = 0; i < matrix.length; i++) {
			int max = findMax(matrix[i]);
			int indexOfMax = getIndex(max, matrix[i]);
			int secondMax = findSecondMax(matrix[i]);
			int indexOfSecondMax = getIndex(secondMax, matrix[i]);
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					int temp = matrix[i][j];
					matrix[i][j] = max;
					matrix[i][indexOfMax] = temp;
				}
				if ((i + j) == (matrix.length-1)) {
					int temp = matrix[i][j];
					matrix[i][j] = secondMax;
					matrix[i][indexOfMax] = temp;
				}
			}
			
		}
		//in ra ma trận đã đổi chỗ
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+",");
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
				if (i+j == matrix.length-1) {
					sum+= matrix[i][j];
					break;
				}
			}
		}
		System.out.println("tổng 2 đường chéo là :" + sum);
	}
	
	public int thirdMax() {
		int[][] matrix = this.matrix;
		int[] intArr = new int[matrix.length*matrix.length];
		int index = 0;
		//gán các phần tử của mảng 2 chiều thành mảng 1 chiều
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				intArr[index] = matrix[i][j];
				index++;
			}
		}
		//tiến hành sắp xếp mảng lại mảng 1 chiều
		
		Arrays.sort(intArr);
		//khai báo biến thirdMax và secondMax
		int secondMax = intArr[intArr.length-1];
		int thirdMax = intArr[intArr.length-1];
		
		//tìm ra giá trị lớn thứ hai trong mảng 1 chiều vừa tạo
		for (int i = intArr.length-1; i >=0; i--) {
			if(intArr[i] < intArr[intArr.length-1]) {
				secondMax = intArr[i];
				break;
			}
		}
		//tìm ra giá trị lớn thứ ba trong mảng 1 chiều vừa tạo
				for (int i = intArr.length-1; i >=0; i--) {
					if(intArr[i] < secondMax) {
						thirdMax = intArr[i];
						break;
					}
				}
				System.out.println("phần tử có giá trị lớn thứ ba trong ma trận là :" + thirdMax);
				System.out.println("các vị trí xuất hiện của nó là: ");
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						if (thirdMax == matrix[i][j]) {
							System.out.println("vị trí: "+i+","+j);
						}
					}
				}
				return thirdMax;
		
		
//		int max = matrix[0][0];
//		int max1= matrix[0][0];
//		int max2= matrix[0][0];
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if (max < matrix[i][j]) {
//					max = matrix[i][j];
//				}
//			}
//		}
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if (max1 < matrix[i][j] &&  matrix[i][j] < max) {
//					max1 = matrix[i][j];
//				}
//			}
//		}
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if (max2 < matrix[i][j] &&  matrix[i][j] < max1) {
//					max2 = matrix[i][j];
//				}
//			}
//		}
//		System.out.println("phần tử có giá trị lớn thứ ba trong ma trận là :" + max2 +","+max1+","+max);
//		System.out.println("các vị trí xuất hiện của nó là: ");
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if (max2 == matrix[i][j]) {
//					System.out.println("vị trí: "+i+","+j);
//				}
//			}
//		}
//		return max2;
	}
}
