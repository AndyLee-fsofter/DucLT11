package com.luvina.main;

import com.luvina.dao.Management;
import com.luvina.entities.PhoneBook;

public class Main {

	public static void main(String[] args) {

		PhoneBook phone1 = new PhoneBook("duc", "121");
		PhoneBook phone2 = new PhoneBook("lehoang", "123");
		PhoneBook phone3 = new PhoneBook("thang", "134");
		PhoneBook phone4 = new PhoneBook("tothang", "431");
		PhoneBook phone5 = new PhoneBook("nguyentahang", "345");
		String phoneBook[] = { phone1.toString(), phone2.toString(), phone3.toString(), phone4.toString(),
				phone5.toString() };
		Management m = new Management(phoneBook);

		m.findPhoneBook("thang");

	}

}
