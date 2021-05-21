package com.luvina.entities;

import java.time.LocalDate;

public class Tasks {
	private int id;
	private String contentTask;
	private LocalDate doingTime;
	private String confirmDidIt;

	public Tasks() {
		super();
	}

	public Tasks(int id, String contentTask, LocalDate doingTime, String confirmDidIt) {
		super();
		this.id = id;
		this.contentTask = contentTask;
		this.doingTime = doingTime;
		this.confirmDidIt = confirmDidIt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContentTask() {
		return contentTask;
	}

	public void setContentTask(String contentTask) {
		this.contentTask = contentTask;
	}

	public LocalDate getDoingTime() {
		return doingTime;
	}

	public void setDoingTime(LocalDate doingTime) {
		this.doingTime = doingTime;
	}

	public String getConfirmDidIt() {
		return confirmDidIt;
	}

	public void setConfirmDidIt(String confirmDidIt) {
		this.confirmDidIt = confirmDidIt;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", contentTask=" + contentTask + ", doingTime=" + doingTime + ", confirmDidIt="
				+ confirmDidIt + "]";
	}

}
