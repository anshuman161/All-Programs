package com.bridgelabz.oopsprograme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
String message = "Hello <<name>>, We have your full name as <<full name>> in our system.your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
Scanner sc=new Scanner(System.in);

		System.out.println(message);
		
		System.out.println("Enter name ");
		String next = sc.next();
		message = message.replace("<<name>>", next);

		System.out.println("Enter full name ");
		String next1 = sc.next();
		message = message.replace("<<full name>>", next1);	
		 
		System.out.println("Enter mobile no");
		  String phone=sc.next(); 
		  if (phone.matches("\\d{10}")) 
		  {
			  message=message.replace("xxxxxxxxxx", phone); 
		  }
		  else {
			System.out.println("phone number is wrong");
			
		}
	 
		  System.out.println("Enter date....");

          String datenext=sc.next();
	   if(datenext.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
	   {
		message = message.replace("01/01/2016", datenext);
	   }
	   else {
		System.out.println("Date format is wrong");
	}
		
         
		System.out.println(message);
		
	}
}
