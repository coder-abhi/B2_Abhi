package com.acts.methods;

import java.util.Scanner;

class Area{
	
	double CalArea(double r){
	return 3.14*r*r;
	}

}

class Circum{
	
	double CalCircum(double r){
	return 3.14*2*r;
	}

}

public class ACCircle{
	public static void main(String[] args){
		
		System.out.println("Enter Radius of Circle");
		Scanner sc= new Scanner(System.in);
		double r= sc.nextDouble();
		
		Area a1= new Area();
		double a =a1.CalArea(r);
		System.out.println(a);
		
		Circum c1= new Circum();
		double c =c1.CalCircum(r);
		System.out.println(c);
		
	}
	
}