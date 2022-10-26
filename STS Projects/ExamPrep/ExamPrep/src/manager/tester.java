package manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class tester {
	public static int taskId = 100;
	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<>();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		taskList.add(new Task(taskId++,"Study","Core Java", LocalDate.parse("2022-10-23")));
		taskList.add(new Task(taskId++,"Sketch","Abstract Art", LocalDate.parse("2022-10-21")));
		taskList.add(new Task(taskId++,"Play","Counter Strike", LocalDate.parse("2022-10-23")));
		do {
			System.out.println("---------Menu----------");
			System.out.println("\n 1. Add new task"
					+ "\n 2. Delete a task"
					+ "\n 3. Update task status"
					+ "\n 4. Display all pending task"
					+ "\n 5. Display all pending tasks for today"
					+ "\n 6. Display all task sorted by task date"
					+ "\n 7. Print all task");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch(choice) {

			case 1:{
				System.out.println("Enter task name");
				String name = sc.nextLine();
				System.out.println("Enter task description");
				String description = sc.nextLine();
				System.out.println("Enter task date");
				String dt = sc.nextLine();
				LocalDate date = LocalDate.parse(dt);

				taskList.add(new Task(taskId++, name, description, date));
				System.out.println("Task Added Successfully");
				break;
			}

			case 2:{
				System.out.println("Enter task Id to delete task");
				int taskId = sc.nextInt();
				for(Task t : taskList) {
					if(t.getTaskId() == taskId) {
						t.setActive(false);
						System.out.println("Task removed successfully");
					}
				}
				break;
			}

			case 3:{
				System.out.println("Enter task Id to update task");
				int taskId = sc.nextInt();
				System.out.println("Enter new task status");
				Status st = Status.valueOf(sc.next());
				for(Task t : taskList) {
					if(t.getTaskId() == taskId) {
						t.setStatus(st);
						System.out.println("Task updated successfully");
					}
				}
				break;
			}
			case 4:{
				for(Task t :taskList) {
					if(t.getStatus().equals(Status.PENDING)) {
						System.out.println(t);
					}
				}

				break;
			}
			case 5:{
				System.out.print("Enter today's date");
				LocalDate today = LocalDate.parse(sc.next());
				for(Task t :taskList) {
					if(t.getStatus().equals(Status.PENDING) && t.getTaskDate().equals(today)) {
						System.out.println(t);
					}
					else {
						System.out.println("No task pending for today");
					}
				}

				break;
			}
			case 6:{
				taskList.stream().sorted(Comparator.comparing(Task::getTaskDate)).forEach(System.out::println);
				break;
			}
			case 7:{
				taskList.forEach(System.out::println);
				break;
			}
			default: {
				System.out.println("Enter correct choice");
				break;
			}



			}

		}while(choice !=0);

		sc.close();
	}

}
