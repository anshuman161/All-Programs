package com.bridgelabz.algorithmprogram;

import java.text.ParseException;

import com.bridgelabz.utility.MyUtil;

public class DayOfCalender 
{
  public static void main(String[] args) throws ParseException
  {
		/*
		 * int x,y,m,y0,m0,d0,d; y0 = y - (14 - m) / 12; x = y0 + y0/4 - y0/100 +
		 * y0/400; m0 = m + 12 * ((14 - m) / 12) - 2; d0 = (d + x + 31*m0 / 12) * mod 7;
		 */
	  
	  
	  String day=MyUtil.dayofweek();
         switch (day)
         {
         case "Sunday":
 			System.out.println("0");
 			break;
         case "Monday":
 			System.out.println("1");
 			break;
         case "Tuesday":
 			System.out.println("3");
 			break;
         case "Wednesday":
 			System.out.println("4");
 			break;
         case "Thursday":
 			System.out.println("5");
 			break;
         case "Friday":
 			System.out.println("6");
 			break;
         case "Saturday":
			System.out.println("7");
			break;
   		default:
			break;
		}
	      
	    
}
}