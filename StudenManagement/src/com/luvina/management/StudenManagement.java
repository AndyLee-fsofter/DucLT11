package com.luvina.management;

import java.util.ArrayList;
import java.util.Scanner;

import com.luvina.student.Student;

public class StudenManagement {
	ArrayList<Student> listStudent = new ArrayList<Student>();

	Scanner sc = new Scanner(System.in);

	public boolean addStudent() {
		System.out.println("nhập vào thông tin học sinh:");
		System.out.println("nhập vào id học sinh:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("nhập vào tên học sinh:");
		String name = sc.nextLine();

		Student student = new Student();
		student.setId(id);
		student.setName(name);

		boolean result = listStudent.add(student);
		if (result) {
			System.out.println("add student successfully");
		} else {
			System.out.println("add student fail");
		}
		return result;
	}

	public boolean deleteStudent() {
		boolean result = false;
		System.out.println("enter your choice :");
		System.out.println("1. delete by id");
		System.out.println("2. delete by name");
		int number = Integer.parseInt(sc.nextLine());
		switch (number) {
		case 1:
			System.out.println("enter id :");
			int id = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < listStudent.size(); i++) {
				if (listStudent.get(i).getId() == id) {
					listStudent.remove(i);
					result = true;
					// hiện đang coi id là unique
					break;
				}
			}
			break;

		case 2:
			int count = 0;
			System.out.println("enter name :");
			String name = sc.nextLine();
			for (int i = 0; i < listStudent.size(); i++) {
				if (listStudent.get(i).getName() == name) {
					listStudent.remove(i);
					count++;
				}
			}
			if (count != 0) {
				result = true;
			}
			break;

		default:
			System.out.println("incorect case, retry please!");
			break;
		}
		if (result) {
			System.out.println("delete successfully");
		} else {
			System.out.println("delete fail");
		}
		return result;
	}
	
	public void displayInfoOfAllStudent() {
		System.out.println("infomation of all student is :");
		System.out.println(listStudent.toString());
	}

}
