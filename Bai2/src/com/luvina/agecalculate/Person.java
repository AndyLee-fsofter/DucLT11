package com.luvina.agecalculate;

import java.util.Date;
import java.util.Calendar;

public class Person {
	private int yearOfBirth;
	private int age;

	public void ageCalculate(int yearOfBirth ) {
		this.yearOfBirth = yearOfBirth;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		age = year - yearOfBirth;
		
	}
	
	public void display() {
		System.out.println("tuổi của người người này là: " + age);
	}
	
}
