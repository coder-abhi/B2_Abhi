package com.acts.Number;

public class Swap{
	public static void main( String[] args){
	int a=10, b=15;
	int temp;
	
	System.out.println("Integers are a=" + a +" and b=" + b); 
	temp=a;
	a=b;
	b=temp;
	System.out.println("Integers after swapping are a=" + a +" and b=" + b); 
}
}
