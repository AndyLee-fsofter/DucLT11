package com.luvina.numbernice;

import java.util.Arrays;
import java.util.Random;

public class NumberNice {
	private int numberNice[] = new int[10];

	public NumberNice() {
		//khởi tạo 1 đối tượng Random
		Random rd = new Random();
		for (int i = 0; i < numberNice.length; i++) {
			//gán giá trị cho các phần tử trong mảng với 1 số có 5 chữ số ngẫu nhiên
			numberNice[i] = rd.nextInt(90000) + 10000;
		}

	}
	
	//phương thức sắp xếp và in ra các phần tử của mảng
	public void printAndSortArr() {
		Arrays.sort(numberNice);

		System.out.println(Arrays.toString(numberNice));
	}

	//phương thức bổ trợ cho phương thức tìm ra số có nhiều chữ số lẻ nhất
	public int countOdd(String s) {
//		tạo 1 mảng các kí tự
		char charArr[] = s.toCharArray();
		//khởi tạo 1 biến count = 0;
		int count = 0;
//		duyệt mảng kí tự vừa tạo
		for (int i = 0; i < charArr.length; i++) {
			//so sánh để tìm ra kí tự nào là số lẻ
			if (charArr[i] == '1' | charArr[i] == '3' | charArr[i] == '5' | charArr[i] == '7' | charArr[i] == '9') {
				//nếu là số lẻ thì tăng biến đếm lên 1 đơn vị
				count++;
			}
		}
		return count;
	}

	//phương thức tìm ra số trong mảng có số lượng chữ số lẻ lớn nhất
	public int printNumberHaveMostOddDigits() {
		int result = numberNice[0];
		for (int i = 0; i < numberNice.length-1; i++) {
			if (countOdd(String.valueOf(numberNice[i])) < countOdd(String.valueOf(numberNice[i + 1]))) {
				result = numberNice[i + 1];
			}
		}
		System.out.println(result);
		return result;
	}
	//phương thức tìm ra bộ 3 số có tổng lớn nhất nhưng không quá 50000
	public void findNumberByCondition() {
		//sắp xếp lại mảng
		Arrays.sort(numberNice);
		/*
		 * thuật toán: ta duyệt từ cuối đến đầu mảng
		 * sau đó cộng tổng 3 số liên tiếp lại, nếu nhỏ hơn 50000 thì ta in ra kết quả ngay
		 */
		int sum = 0;
		for (int i = numberNice.length-1; i > 1; i--) {
			if (numberNice[i] + numberNice[1] + numberNice[i-2] < 50000) {
				System.out.println("bộ 3 phần tử trong mảng có tổng lớn nhất nhưng không quá 50000 là: ");
				System.out.println(numberNice[i] + "," + numberNice[1] + "," + numberNice[i-2]);
				break;
			}
		}
		
		if (sum == 0) {
			System.out.println("không có bộ ba số nào thỏa mãn");
		}
	}
}
