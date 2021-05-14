package com.luvina.entities;

public class Student {
	private int id;
	private String name;
	private int score;

	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return id + "_" + name + "_" + score;
	}

}
