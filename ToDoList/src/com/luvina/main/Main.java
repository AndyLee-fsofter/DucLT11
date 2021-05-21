package com.luvina.main;

import java.time.LocalDate;
import com.luvina.entities.Tasks;
import com.luvina.taskmanagement.TaskManagement;

public class Main {
	public static void main(String[] args) {
		Tasks task1 = new Tasks(1, "go bank", LocalDate.of(2021, 5, 22), "not confirm");
		Tasks task2 = new Tasks(2, "go school", LocalDate.of(2021, 6, 22), "not confirm");
		Tasks task3 = new Tasks(3, "go to fishing", LocalDate.of(2021, 5, 23), "not confirm");
		Tasks task4 = new Tasks(4, "play basket ball", LocalDate.of(2021, 5, 20), "confirmed");
		Tasks task5 = new Tasks(5, "go to sleep", LocalDate.of(2021, 5, 19), "confirmed");
		
		TaskManagement tm = new  TaskManagement();
		tm.createAllTask(task1,task2,task3,task4,task5);
		tm.deleteTask();
		System.out.println("----------------");
		tm.editTask();
		System.out.println("----------------");
		tm.searchTask();
	}
}
