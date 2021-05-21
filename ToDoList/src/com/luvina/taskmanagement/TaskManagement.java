package com.luvina.taskmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.luvina.entities.Tasks;

public class TaskManagement {
	List<Tasks> taskList = new ArrayList<Tasks>();

	Scanner sc = new Scanner(System.in);

	public void createAllTask(Tasks... tasks) {
		for (int i = 0; i < tasks.length; i++) {
			taskList.add(tasks[i]);
		}
	}

	public boolean createNewTask(Tasks task) {
		return taskList.add(task);
	}

	// xóa task theo id truyền vào
	public boolean deleteTask() {
		boolean result = false;
		System.out.println("Input your choice:");
		System.out.println("1.delete by id");
		System.out.println("2.delete by content");
		System.out.println("");
		int number;
		number = Integer.parseInt(sc.nextLine());
		switch (number) {
		case 1:
			int taskId;
			System.out.println("input task id: ");
			taskId = Integer.parseInt(sc.nextLine());
			// duyệt trong list
			for (int i = 0; i < taskList.size(); i++) {
				// nếu có id giống id được truyền vào
				if (taskList.get(i).getId() == taskId) {
					// gán kết quả bằng true
					result = true;
					// remove theo id được truyền vào
					taskList.remove(i);
					break;
				}

			}
			break;
		case 2:
			int count = 0;
			String content;
			System.out.println("input your content:");
			content = sc.nextLine();
			taskId = Integer.parseInt(sc.nextLine());
			// duyệt trong list
			for (int i = 0; i < taskList.size(); i++) {
				// nếu có content giống content được truyền vào
				if (taskList.get(i).getContentTask() == content) {
					// remove theo id được truyền vào
					taskList.remove(i);
					count++;
				}
			}
			if (count != 0) {
				result = true;
			}
			break;

		default:
			System.out.println("nhập vào 1 hoặc 2");
			break;
		}
		if (result) {
			System.out.println("delete sucessfully");
		} else {
			System.out.println("delete fail");
		}
		return result;
	}

	public boolean editTask() {
		boolean result = false;
		System.out.println("input your choice: ");
		System.out.println("1.edit id");
		System.out.println("2.edit content");
		int number;
		number = Integer.parseInt(sc.nextLine());
		switch (number) {
		case 1:
			System.out.println("input task id that you want to edit and info that you want to edit");
			System.out.println("enter id:");
			int taskId = Integer.parseInt(sc.nextLine());
			System.out.println("enter content:");
			String content = sc.nextLine();
			for (int i = 0; i < taskList.size(); i++) {
				// nếu có id giống id được truyền vào
				if (taskList.get(i).getId() == taskId) {
					// gán kết quả bằng true
					result = true;
					// gán lại nội dung cho task và break ra khỏi vòng lặp
					taskList.get(i).setContentTask(content);
					break;
				}
			}
			break;

		case 2:
			System.out.println("input task id that you want to edit and info that you want to edit");
			int taskId1 = Integer.parseInt(sc.nextLine());
			String content1 = sc.nextLine();
			for (int i = 0; i < taskList.size(); i++) {
				// nếu có content giống content được truyền vào thì sửa lại id theo id được nhập
				if (taskList.get(i).getContentTask().equals(content1)) {
					// gán kết quả bằng true
					result = true;

					taskList.get(i).setId(taskId1);
					break;
				}
			}
			break;

		default:
			System.out.println("nhập vào 1 hoặc 2");
			break;
		}
		if (result) {
			System.out.println("edit sucessfully");
		} else {
			System.out.println("edit fail");
		}
		return result;
	}

	public ArrayList<Tasks> searchTask() {
		ArrayList<Tasks> result = new ArrayList<Tasks>();
		System.out.println("enter your choice :");
		System.out.println("1. search by doingTime");
		System.out.println("2.search by content");
		int number = Integer.parseInt(sc.nextLine());
		switch (number) {
		case 1:
			System.out.println("enter time you want to search");
			LocalDate time = LocalDate.parse(sc.nextLine());
			for (int i = 0; i < taskList.size(); i++) {
				if (time.isEqual(taskList.get(i).getDoingTime())) {
					result.add(taskList.get(i));
				}
			}
			break;
		case 2:
			System.out.println("enter content :");
			String content = sc.nextLine();
			for (int i = 0; i < taskList.size(); i++) {
				if (taskList.get(i).getContentTask().equals(content)) {
					result.add(taskList.get(i));
				}
			}
		default:
			System.out.println("enter 1 or 2");
			break;
		}
		System.out.println("danh sách được tìm thấy :");
		System.out.println(result);
		return result;
	}
	
	public void alarm() {
		//giả lập báo thức
		for (int i = 0; i < taskList.size(); i++) {
			if (LocalDate.now().isEqual(taskList.get(i).getDoingTime())) {
				System.out.println(" báo thức ting ting ting ");
			}
		}
		
	}

}
