package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		// Only works if 0 <= N < 31 since 2^31 overflows an int
		if (0 <= num &&  num < 31)
		{

			double d = (Math.pow(2, num));

			System.out.println("Power of 2^ is" + num + "=" + d);
			System.out.println("Printing all value till Power Value " + num);
		  for (int i = 1; i <= num; i++) 
		  {
			System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
		  }
		}
	}
}