package com.luvina.intarray;

import java.util.Arrays;

public class IntArray {
	private int intArr[] = { 1, 2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2 };

	@Override
	public String toString() {
		return "IntArray [intArr=" + Arrays.toString(intArr) + "]";
	}

	public void sortByAsc() {
		// tạo 1 mảng clone giống mảng khởi tạo để không làm sai lệch dữ liệu của mảng
		int intArrClone[] = intArr;
		Arrays.sort(intArrClone);
		System.out.println(Arrays.toString(intArrClone));
	}


	public int[] deleteDuplicateNumber() {
		// tạo 1 mảng clone giống mảng khởi tạo để không làm sai lệch dữ liệu của mảng
		int intArrClone[] = intArr;
		// sắp xếp lại mảng clone
		Arrays.sort(intArrClone);

		int count = 1;

		for (int i = 0; i < intArrClone.length - 1; i++) {
			if (intArrClone[i] != intArrClone[i + 1]) {
				count++;
			}
		}

		// tạo mảng mới có số phần tử bằng count để chứa dữ liệu
		int intArrSorted[] = new int[count];
		int number = intArrClone[0];
		intArrSorted[0] = number;
		int count1 = 1;
		for (int i = 0; i < intArrClone.length - 1; i++) {
			if (number != intArrClone[i + 1]) {
				number = intArrClone[i + 1];
				intArrSorted[count1] = number;
				count1++;
			}
		}

		System.out.println(Arrays.toString(intArrSorted));
		return intArrSorted;
	}
	//overloading lại hàm này để sử dụng trong ý 4
	public int[] deleteDuplicateNumber(int intArr[]) {
		// tạo 1 mảng clone giống mảng khởi tạo để không làm sai lệch dữ liệu của mảng
		int intArrClone[] = intArr;
		// sắp xếp lại mảng clone
		Arrays.sort(intArrClone);

		int count = 1;

		for (int i = 0; i < intArrClone.length - 1; i++) {
			if (intArrClone[i] != intArrClone[i + 1]) {
				count++;
			}
		}

		// tạo mảng mới có số phần tử bằng count để chứa dữ liệu
		int intArrSorted[] = new int[count];
		int number = intArrClone[0];
		intArrSorted[0] = number;
		int count1 = 1;
		for (int i = 0; i < intArrClone.length - 1; i++) {
			if (number != intArrClone[i + 1]) {
				number = intArrClone[i + 1];
				intArrSorted[count1] = number;
				count1++;
			}
		}

		System.out.println(Arrays.toString(intArrSorted));
		return intArrSorted;
	}

	public void findIntersectionOf2Array(int Arr[]) {
		//khởi tạo giá trị count để đếm số phần tử của mảng mới
		int count = 0;
		//khởi tạo 1 mảng mới đã được sắp xếp về xóa các dữ liệu trùng lặp từ mảng ban đầu
		int intArrClone[] = deleteDuplicateNumber(intArr);
		int arrClone[] = deleteDuplicateNumber(Arr); 

		for (int i = 0; i < intArrClone.length; i++) {
			for (int j = 0; j < arrClone.length; j++) {
				if (intArrClone[i]==arrClone[j]) {
					count++;
					break;
				}
			}
		}
		//khởi tạo một mảng mới để lưu kết quả
		int result[] = new int[count];
		//khởi tạo giá trị để gán cho index của mảng mới
		int c = 0;
		for (int i = 0; i < intArrClone.length; i++) {
			for (int j = 0; j < arrClone.length; j++) {
				if (intArrClone[i]==arrClone[j]) {
					result[c] = intArrClone[i];
					c++;
					break;
				}
			}
		}
		System.out.println("mảng giao điểm là : " + Arrays.toString(result));
	}
}
