package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0 || year % 400 == 0) 
			{
				System.out.println("This year is leap year=" + year);
			} 
			else
			{

				System.out.println("not leap year");
			}
		}

	}
}