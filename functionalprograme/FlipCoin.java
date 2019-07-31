package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class FlipCoin {
	
	
	public static void main(String[] args) {
		double Headcount = 0;
		double Tailscount = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double d = Math.random();
		System.out.println(d);
		if (d < 0.5) 
		{
			Headcount = Headcount + 1;
		} else {
			Tailscount = Tailscount + 1;
		}
		System.out.println("Head="+" "+100*(Headcount/n));
		System.out.println("Tail="+" "+100*(Tailscount/n));
            
	}
}