package com.luvina.main;

import com.luvina.array.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,2,3,1,5,4,1,4,5,3,2};
		Arrays a = new  Arrays(arr);
		a.coupleOf2NumHaveSumEqual5();
	}
}
