package com.luvina.integerstring;

public class IntegerString {
	private String numA;
	private String numB;

	public IntegerString(String numA, String numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public int sum() {
		int sum = 0;
		StringBuilder sumStringBuilder = new StringBuilder();
		int remember = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		if (numA.length() < numB.length()) {
			sb.append(numA);
			sb1.append(numB);
			for (int i = 0; i <= sb1.length() - sb.length(); i++) {
				sb.insert(0, '0');
			}

		} else if (numA.length() == numB.length()) {
			sb.append(numA).insert(0, '0');
			sb1.append(numA).insert(0, '0');
		} else {
			sb.append(numB);
			sb1.append(numA);
			for (int i = 0; i <= sb1.length() - sb.length(); i++) {
				sb.insert(0, '0');
			}			
		}
		
		for (int i = 0; i < sb.length(); i++) {
			int tmp = Integer.parseInt(String.valueOf(sb.charAt(sb.length() - i - 1)))
					+ Integer.parseInt(String.valueOf(sb1.charAt(sb1.length() - i - 1))) + remember;
			if (tmp >= 10) {
				remember = 1;
				String tmp1 = String.valueOf(tmp - 10);
				sumStringBuilder.insert(0, tmp1);
			} else {
				remember = 0;
				String tmp2 = String.valueOf(tmp);
				sumStringBuilder.insert(0, tmp2);
			}
		}
		sum = Integer.parseInt(sumStringBuilder.toString());
		System.out.println(sum);
		return sum;
	}

}
