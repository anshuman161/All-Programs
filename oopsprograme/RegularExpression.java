package com.bridgelabz.oopsprograme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
String message = "Hello <<name>>, We have your full name as <<full name>> in our system.your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
Scanner sc=new Scanner(System.in);

		System.out.println(message);
		String next = sc.next();
		message = message.replaceAll("<<name>>", next);
		String next1 = sc.nextLine();
		message = message.replaceAll("<<full name>>", next1);	
		  //mobile no 
		  String mob=sc.next(); 
		  if (mob.matches("\\d{10}")) 
		  {
		  message=message.replaceAll("xxxxxxxxxx", mob); 
		  }

	 //date format 
	 String datenext=sc.next();

	if(datenext.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
	{
		message = message.replaceAll("01/01/2016", datenext);
	}
		
         
		System.out.println(message);
		
	}
}
