package numberProblems;

import java.util.Scanner;

public class PrimeNo{
public static void main(String[] args){
	int n, flag=0;
	System.out.println("Enter Number to check Prime or not");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	
	int m=n/2;
	for(int i=2; i<m; i++){
		if (n%i==0)
		{
		flag=1;
		}
	}
	if(flag==1)
		System.out.println(n+ " is not Prime Number ");
	else
		System.out.println(n+ " is Prime Number ");

}
}

/* DOUBLE  FOR  LOOP

import java.util.Scanner;

public class PrimeNo{
public static void main(String[] args){
	int n, flag=0;
	
	System.out.println("Enter value up to which Prime Numbers to be printed");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	System.out.println("\n Prime Numbers up to " +n + " are  ");
	for(int i=2; i<n; i++){
		flag=0;
		for(int j=i-1; j>=2 ; j--){
			if (i%j==0)
				flag=1;
		}
		if (flag==0)
		{
			System.out.println(i+ " ");
			
		}
	}
}
}*/