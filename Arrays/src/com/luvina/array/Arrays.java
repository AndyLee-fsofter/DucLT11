package com.luvina.array;

public class Arrays {
	private int intArr[] = new int[20];

	public Arrays(int[] intArr) {
		
		this.intArr = intArr;
	}
	//phương thức in ra số lớn nhất trong mảng
	public void printBiggestIntOfArr() {
		int biggest = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > biggest) {
				biggest = intArr[i];
			}
		}
		System.out.println(biggest);
	}
	//phương thức in ra số nhỏ thứ 2 trong mảng
	public void printSecondSmallerInArray() {
		@SuppressWarnings("unused")
		int smallest = 0;
		int smaller = 0;
		for (int i = 0; i < intArr.length - 1; i++) {
			if (intArr[i] > intArr[i + 1]) {
				smallest = intArr[i];
				smaller = intArr[i + 1];
			} else {
				smallest = intArr[i + 1];
				smaller = intArr[i];
			}
		}
		System.out.println("số nhỏ thứ hai trong mảng là : " + smaller);
	}

	// phương thức kiểm tra số nguyên tố dùng cho phương thức in ra số nguyên tố
	public boolean checkPrime(int n) {
		boolean result = false;
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

	// phương thức in ra các số nguyên tố trong mảng
	public void printPrimeInArray() {
		System.out.println("các số nguyên tố trong dãy là :");
		for (int i = 0; i < intArr.length; i++) {
			if (checkPrime(intArr[i])) {
				System.out.println(intArr[i]);
			}
		}
	}
	//phương thức lấy ra cặp 2 số liền nhau trong mảng có tổng bằng 5
	public void coupleOf2NumHaveSumEqual5() {
		for (int i = 0; i < intArr.length - 1; i++) {
			if ((intArr[i] + intArr[i + 1]) == 5) {
				System.out.println(intArr[i] + " " + intArr[i + 1]);
			}
		}
	}
}
