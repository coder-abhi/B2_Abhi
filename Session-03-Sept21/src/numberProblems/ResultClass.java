package numberProblems;

import java.util.Scanner;

public class ResultClass{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double marks;
		System.out.println("Enter Marks");
		marks= sc.nextDouble();
	
		
		if(marks>=40 && marks<50)
			System.out.println(" Pass Class");
		else if (marks>=50 && marks<60)
			System.out.println("Second Class");
		else if (marks>=60 && marks<70)
			System.out.println("First Class");
		else if (marks>=70)
			System.out.println("Distinction");
		else
			System.out.println("Failed");		
	}
	
}