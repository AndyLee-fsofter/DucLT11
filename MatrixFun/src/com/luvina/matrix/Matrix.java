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
}
