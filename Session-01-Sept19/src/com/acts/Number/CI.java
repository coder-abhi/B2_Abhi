package com.acts.Number;

import java.util.*;

public class CI{
	public static void main( String[] args){
	double p=100,r=10,t=1;
	double ci;
	
	ci= p*(Math.pow((1.0+(r/100)),t));

	System.out.println("CI = " + ci);
}
}
