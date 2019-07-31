package com.bridgelabz.functionalprograme;


import java.util.Scanner;

public class StopWatch {

	

	public static void time() {
		/*
		 * for (int h = 0; h < 24; h++) { for (int m = 0; m < 60; m++) { for (int s = 0;
		 * s < 60; s++) { for (int ms = 0; ms < 1000; ms++) { System.out.println(h + ":"
		 * + m + ":" + s + ":" + ms); } } } }
		 */
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println("start time");
		long start=System.currentTimeMillis();
		
		
		int k=s.nextInt();
		System.out.println("End time ");
		long end=System.currentTimeMillis();
		long op=end - start ;
		System.out.println("Time between the starting point and ending point= "+ op);
	}

	public static void main(String[] args)  {
		time();
		

	}
}
//Not done