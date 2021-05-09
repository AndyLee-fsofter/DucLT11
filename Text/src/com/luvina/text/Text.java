package com.luvina.text;

public class Text {
	private String text;

	public Text(String text) {
		super();
		this.text = text;
	}

	public int sumOfNumberInString() {

		int sum = 0;
		for (int i = 0; i < text.length();) {
			String intString = "0";
			if (text.charAt(i) > 47 && text.charAt(i) < 58) {
				for (int j = i; j < text.length();) {
					if (text.charAt(j) > 47 && text.charAt(j) < 58) {
						intString += text.charAt(j);
						j++;
						i = j;
					} else {
						i = j;
						break;
					}
				}

				sum += Integer.parseInt(intString);
				intString = "0";
			}
			i++;

		}
		System.out.println("sum = " + sum);
		return sum;
	}

	public void findAndPrintNumberHaveSmallestAscii() {
		char temp = text.charAt(0);
		for (int i = 0; i < text.length() - 1; i++) {
			if (temp > text.charAt(i)) {
				temp = text.charAt(i);
			}
		}
		System.out.println("kí tự có mã ascii nhỏ nhất là :" + temp);
	}

	public void vietHoaChuCaiDau() {
		String convertText = "";
		convertText += Character.toUpperCase(text.charAt(0));
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == 32) {
				convertText += text.charAt(i);
				convertText += Character.toUpperCase(text.charAt(i + 1));
				i++;
			} else {
				convertText += text.charAt(i);
			}
		}
		System.out.println("text sau chuyển đối :" + convertText);
	}
	
	public void inRaChuoiDaoNguoc() {
		String chuoiDaoNguoc = "";
		for (int i = 0; i < text.length(); i++) {
			chuoiDaoNguoc += text.charAt(text.length()-i);
		}
		System.out.println("chuỗi đảo ngược là: "+ chuoiDaoNguoc);
	}

}
