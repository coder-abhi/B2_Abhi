package com.acts.methods;

import java.util.Scanner;

public class SwapWOThird{
 public static void main(String[] args){
	int a,b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two numbers");
	a= sc.nextInt();
	b=sc.nextInt();
	System.out.println("Numbers before swap " + a +" "+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers after swap " + a +" "+ b);
	
	
 }
}