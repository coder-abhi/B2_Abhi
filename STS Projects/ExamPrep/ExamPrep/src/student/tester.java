package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class tester {
public static void main(String[] args) {
	int choice= 0;
	Scanner sc = new Scanner (System.in);
	
	List<Student> studentList = CollectionUtils.populateData();
	
	do {
		System.out.println("--------  Menu ---------");
		System.out.println("\n 1.Display All Student"
				+ "\n 2.Sort by GPA"
				+ "\n 3.Sum of gpa according to specified subject"
				+ "\n 4.Average of gpa according to specified subject"
				+ "\n 5.Print name of specified subject topper"
				+ "\n 6.Print names of failures for the specified subject ");
		System.out.println("Enter Choice");
		choice = sc.nextInt(); 
		
		switch(choice) {
		
		case 1:{
			studentList.forEach(System.out::println);	
			break;
		}
		
		case 2:{
			studentList.stream().sorted(Comparator.comparing(Student::getGpa)).forEach(System.out::println);
			break;
		}
		
		case 3:{
			System.out.println("Enter subject");
			String sub =sc.next();
            Subject subject = Subject.valueOf(sub);
            double sum = studentList.stream().filter(s-> s.getSubject().equals(subject)).mapToDouble(s-> s.getGpa()).sum();
            System.out.println("Sum is: "+sum);
			break;
		}
		
		case 4:{
			System.out.println("Enter subject");
			String sub =sc.next();
            Subject subject = Subject.valueOf(sub);
            OptionalDouble avg =  studentList.stream().filter(s-> s.getSubject().equals(subject)).mapToDouble(s-> s.getGpa()).average();
            System.out.println("Average is: "+avg);
			break;
		}
		
		case 5:{
			System.out.println("Enter subject");
			String sub =sc.next();
            Subject subject = Subject.valueOf(sub);
            System.out.println(studentList.stream().filter(s-> s.getSubject().equals(subject)).max(Comparator.comparing(Student::getGpa)));
			break;
		}
		case 6:{
			System.out.println("Enter subject");
			String sub =sc.next();
            Subject subject = Subject.valueOf(sub);
			studentList.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).dropWhile(s -> (s.getGpa()>4.0)).forEach(System.out::println);
			break;
		}
		}
		
	}while (choice!=0);
}
}
