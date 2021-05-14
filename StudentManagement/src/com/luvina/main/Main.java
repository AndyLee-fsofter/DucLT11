package com.luvina.main;

import com.luvina.dao.StudentManagement;
import com.luvina.entities.Student;

public class Main {

	public static void main(String[] args) {
		Student stud1 = new Student(1, "duc", 1);
		Student stud2 = new Student(2, "hoang", 10);
		Student stud3 = new Student(3, "sinh", 10);
		Student stud4 = new Student(4, "huyen", 9);
		Student stud5 = new Student(5, "tra", 8);
		
		String students[] = {stud1.toString(),stud2.toString(),stud3.toString(),stud4.toString(),stud5.toString()};
		StudentManagement sm = new StudentManagement(students);
		sm.printList();
		sm.findStudentByScore(10);
		sm.findStudentByScore(1);
		sm.findStudentByScore(6);
		
		
		
	}

}
