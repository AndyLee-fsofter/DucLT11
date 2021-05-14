package com.luvina.array;

public class ArrayUtil {
	private int array[];
	private int n;

	// constructor có 1 tham số n để khởi tạo số phần tử của mảng
	public ArrayUtil(int n) {
		this.n = n;
		array = new int[n];
		for (int i = 0; i < this.n; i++) {
			// gán từng phần tử của mảng cho các số tự nhiên ngẫu nhiên từ 1 đến 50
			array[i] = (int) Math.random() * 50;
		}
	}

	public boolean checkTriagle(int a, int b, int c) {
		boolean result = false;
		if ((a + b) > c && (a + c) > b && (c + b) > a) {
			result = true;
		}
		return result;
	}
	
	//phương thức tìm ra 3 cạnh của tam giác
	public int findTriagle() {
		int result = 0;
		for (int i = 0; i < array.length-2; i++) {
			if (checkTriagle(array[i], array[i+1], array[i+2])) {
				result++;
				System.out.print("("+array[i]+","+array[i+1]+","+array[i+2]+","+")"+",");
			}
		}
		System.out.println();
		System.out.println("số bộ số thỏa mãn là 3 cạnh của 1 tam giác là : "+ result);
		return result;
	}

}
