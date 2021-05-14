package com.luvina.dao;

public class StudentManagement {
	private String student[];

	public StudentManagement(String[] student) {
		super();
		this.student = student;
	}

	public void printList() {
		int count = 1;
		System.out.println("thông tin của các học sinh : id_name_score");
		for (int i = 0; i < student.length; i++) {
			System.out.println("thông tin của học sinh thứ " + count + " :" + student[i]);
			count++;
		}
	}

	public int pickUpScoreOfStudent(String studentInfo) {
		int score = 0;
		StringBuilder sb = new StringBuilder(studentInfo);
		for (int i = sb.length() - 1; i >= 0; i--) {
			if (sb.charAt(i) == '_') {
				sb.delete(0, i+1);
				break;
			}
		}
		score = Integer.parseInt(sb.toString());
		return score;
	}

	public void findStudentByScore(int score) {
		int count = 0;
		System.out.println("các học sinh có điểm " + score + " là: ");
		for (int i = 0; i < student.length; i++) {
			if (pickUpScoreOfStudent(student[i]) == score) {
				System.out.println(student[i]);
				count++;
			}
		}
		if (count>0) {
			System.out.println("có "+count+" học sinh có điểm "+score);
		} else {
			System.out.println("không có học sinh nào có điểm "+score);
		}
	}
}
