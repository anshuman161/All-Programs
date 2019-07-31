package com.bridgelabz.functionalprograme;


import java.io.*;

public class Quadratic {
	// delta = b*b - 4*a*c

	static void findRoots(int a, int b, int c) {
		// If a is 0, then equation is not
		// quadratic, but linear

		if (a == 0)
		{
			System.out.println("Invalid");
		}


		int delta = b * b - 4 * a * c;
		// System.out.println(delta);

		// Root 1 of x = (-b + sqrt(delta))/(2*a)
		// Root 2 of x = (-b - sqrt(delta))/(2*a)

		if (delta > 0) {
			System.out.println("Roots are real and different ");
			double d1 = (-b + Math.sqrt(delta)) / (2 * a);
			double d2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1 of x =" + d1 + "\n" + "Root 2 of x =" + d2);
		} else // delta < 0
		{
			System.out.println("Roots are complex ");

			System.out.println(-(double) b / (2 * a) + " + i" + Math.sqrt(delta) + "\n" + -(double) b / (2 * a) + " - i"
					+ Math.sqrt(delta));
		}
	}
	public static void main(String args[]) {
		
		int a = 3, b = -7, c = 12;
		findRoots(a, b, c);
	}
}