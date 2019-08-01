package com.bridgelabz.datastructureprogram;

import java.util.Scanner;

public class CalenderOfMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of month :-");
		String month = sc.next();
		System.out.println();
		System.out.print("Enter Year :-");
		int Y = sc.nextInt();
        int max;
		String[] months = { "", // leave empty so that we start with months[1] = "January"
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (Y % 4 == 0 && Y % 400 == 0) {
			days[2] = 29;
		}
		for (int M = 1; M <= 12; M++) 
		{
              if (month.equalsIgnoreCase(months[M]))
              {
				  max=days[M];    
			  }
		}
        
		String[] dayname= {"","sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		String sname="";
		for (int i = 1; i <= 7; i++)
		{
		        sname=dayname[i];	
		}
		System.out.println("Month name and year :"+month+" "+Y);
		System.out.println("_____________________________________");
        System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");
        
        
		
	}
}
