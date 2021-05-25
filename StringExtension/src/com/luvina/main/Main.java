package com.luvina.main;

import com.luvina.entities.StringExtension;

public class Main {

	public static void main(String[] args) {
		StringExtension se = new StringExtension();
		se.findTheMostAppearingCharacter("Xin chao cac ban Luvina Phitin");
//		se.countDigitsInStringText("Xin chao cac ban Luvina Phitin");
		System.out.println("----------");
		se.sortUpWord("Xin chao cac ban Luvina Phitin");
	}

}
