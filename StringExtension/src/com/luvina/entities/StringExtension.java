package com.luvina.entities;

import java.util.Arrays;

public class StringExtension {
	private String text;

	/**
	 * Bài 1: Xây dựng chương trình StringExtension có một đối tượng StringExtension
	 * chứa các phương thức làm việc với String như sau: Phương thức
	 * findTheMostAppearingCharacter(String text): Là phương thức tìm và in chữ cái
	 * xuất hiện nhiều nhất trong chuỗi text. VD: Chuỗi “Xin chao cac ban Luvina
	 * Phitin” => Chữ i, n, a đều xuất hiện 4 lần. Phương thức sortUpWord(String
	 * text): là phương thức sắp xếp các ký tự trong 1 chuỗi theo thứ tự tăng dần.
	 * Xây dựng đối tượng Main để thực thi test cho chương trình. Yêu cầu: Áp dụng
	 * các tính chất của lập trình hướng đối tượng để xây dựng chương trình Chỉ sử
	 * dụng các kiến thức đến bài Arrays để làm.
	 * 
	 * @param text
	 */

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	/**
	 * phương thức tìm ra số kí tự khác nhau trong 1 chuỗi text
	 * @param text
	 * @return
	 */

	public int countDigitsInStringText(String text) {
		StringBuilder sb = new StringBuilder(text);
		int result = 0;
		while (!sb.isEmpty()) {
			char temp = sb.charAt(0);
			sb.deleteCharAt(0);
			for (int i = 1; i < sb.length(); i++) {
				if (temp == sb.charAt(i)) {
					sb.deleteCharAt(i);
				}
			}
			result++;
		}
		return result;
	}
	//phương thức tìm số lớn nhất trong mảng
	public int findMax(int[] intArr) {
		int max = intArr[0];
		for (int i = 1; i < intArr.length; i++) {
			if (max < intArr[i]) {
				max = intArr[i];
			}
		}
		return max;
	}

	public void findTheMostAppearingCharacter(String text) {
		//tạo 1 mảng char để lưu lại các kí tự xuất hiện và 1 mảng int để lưu lại số lần xuất hiện của nó
		int[] appearing = new int[countDigitsInStringText(text)];
		char[] charAtIndexOfAppearing = new char[countDigitsInStringText(text)];
		StringBuilder sb = new StringBuilder(text);
		int index = 0;
		while (!sb.isEmpty()) {
			int count = 1;
			char temp = sb.charAt(0);
			sb.deleteCharAt(0);
			for (int i = 0; i < sb.length(); i++) {
				if (temp == sb.charAt(i)) {
					sb.deleteCharAt(i);
					count++;
					i--;
				}
			}if (temp!=' ') {
				appearing[index] = count;
				charAtIndexOfAppearing[index] =temp;
				index++;
			}
		}
				
		int mostAppearing = findMax(appearing);
		System.out.println("Các kí tự có sô lần xuất hiện lớn nhất là: " + mostAppearing);
		for (int i = 0; i < charAtIndexOfAppearing.length; i++) {
			if (mostAppearing == appearing[i]) {
				System.out.print(charAtIndexOfAppearing[i]+",");
			}
		}

	}
	
	public void sortUpWord(String text) {
		char[] charArray = text.toCharArray();
		Arrays.sort(charArray);
		StringBuilder textSorted = new StringBuilder("");
		for (int i = 0; i < charArray.length; i++) {
			textSorted.append(charArray[i]);
		}
		System.out.println("chuỗi sau khi sắp xếp là : "+ textSorted.toString().trim());
	}
}
