package com.luvina.main;

import com.luvina.numbernice.NumberNice;

public class Main {

	public static void main(String[] args) {
		NumberNice n = new NumberNice();
		n.printAndSortArr();
		System.out.println("---------------");
		n.printNumberHaveMostOddDigits();
		System.out.println("---------------");
		n.findNumberByCondition();
	}

}
