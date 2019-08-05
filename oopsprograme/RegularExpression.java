package com.bridgelabz.oopsprograme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String message = "Hello <<name>>, We have your full name as "
				+ "<<full name>> in our system."
	+ " your contact number is 91-xxxxxxxxxx. Please,let us know in "
	+ "case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String next=sc.next();
		message = message.replaceAll("<<name>>", next);
		String next1=sc.nextLine();
		message = message.replaceAll("<<full name>>", next1);
		
		//date format
		CharSequence datenext=sc.next();
		Pattern datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		Matcher m = datePatt.matcher(datenext);
		if (m.matches()) {
		  int day   = Integer.parseInt(m.group(1));
		  int month = Integer.parseInt(m.group(2));
		  int year  = Integer.parseInt(m.group(3));
		}
		System.out.println(m);
			//System.out.println(message);

		//mobile no
		CharSequence mobile=sc.next();
		String mob="1234567890";
		String pattern = "\\d\\d\\d([,\\s])?\\d\\d\\d\\d";
		Pattern.matches(mob, mobile);
		
		
         
		
	}
}
