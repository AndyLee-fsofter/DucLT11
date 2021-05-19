package com.luvina.main;

import com.luvina.intarray.IntArray;

public class Main {

	public static void main(String[] args) {
		IntArray intArray = new IntArray();		
		
		//intArray.sortByAsc();
		
		intArray.deleteDuplicateNumber();
		
		int arr[] = {1,2,6,6,7,8,8,9};
		
		intArray.findIntersectionOf2Array(arr);

	}

}
