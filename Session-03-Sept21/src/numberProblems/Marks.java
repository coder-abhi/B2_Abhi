package numberProblems;

import java.util.*;
public class Marks {
	public static void main(String[] args) {
	
		System.out.println("Enter Marks");
		Scanner s1 = new Scanner(System.in);
		
		int marks = s1.nextInt();
		
		if(marks>=90 && marks <= 100)
			System.out.println("A");
		else if(marks>=80 && marks <= 89)
			System.out.println("B");
		else if(marks>=70 && marks <= 79)
			System.out.println("C");
		else if(marks>=60 && marks <= 69)
			System.out.println("D");
		else
			System.out.println("F");
	}
}