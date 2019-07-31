package com.bridgelabz.algorithmprogram;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MyUtil 
{
	
	
	public static int palindrome(int npalinfrome) 
	{
		int demo;
		int m = npalinfrome;
		int apalinfrome = 0;
		while (npalinfrome != 0) 
		{			
			demo = npalinfrome % 10;			
			apalinfrome = apalinfrome * 10 + demo;			
			npalinfrome = npalinfrome / 10;			
		}
		if (apalinfrome == m) 
		{
			System.out.println("This is palindrome number  " + apalinfrome);
		}
		else
		{
			System.out.println("This is not palindrome number"+apalinfrome);
		}
		return apalinfrome;
	}
	///////////////////////////---------------------------------------
	
	public static int prime(int n)
	{
		int m=n/2;
		int flag=0;
		for (int i = 2; i <= m; i++)
		{
		    	if (n%i==0)
		    	{
				   System.out.println("This number is not a prime no "+n);	
				   flag=1;  
				   break;
		    	}
		}
		if (flag==0)
		{
			   System.out.println("This number is a prime no "+n);
		}
		return flag;
		
	   	
	}
////////////////////////////------------------------------------------
	
	public static void anagram(String str)
	{
		char[] ch=str.toCharArray();
	       Arrays.sort(ch);
		 System.out.println(ch);
	}
///////////////////////////-------------------------------------
	
	public static int[] scannerarrayint()
	{
	    Scanner s=new Scanner(System.in);
	        
	      int n = s.nextInt();

	      int a[],i=0;

	      a= new int[n];

	      System.out.println("elements are:");

	      for(i = 0;i<n;i++)

	      {

	      a[i]= s.nextInt();

	      }

	      System.out.println("---------------------------------");

	      for(i = 0;i<n;i++)
 
	      System.out.println(a[i]);
		return a;
           
	      }
///////////////////////////////----------------------------
	public static String[] scannerarraystring()
	{
	    Scanner s=new Scanner(System.in);
	              int n =s.nextInt(); 
	       
	      String a[];
	      int i=0;

	      a= new String[n];

	      System.out.println("elements are:");

	      for(i = 0;i<n;i++)

	      {

	      a[i]= s.nextLine();

	      }

	      System.out.println("---------------------------------");

	      for(i = 0;i<n;i++)
 
	      System.out.println(a[i]);
		return a;
           
	      }
	
///////////////////////////////-----------------------------
	public static String getstring()
	{
		 Scanner s=new Scanner(System.in);
	     
		 System.out.println("enter string value");
	     String str = s.nextLine();
	     return str;
	               	
	}
	
/////////////////////////////////-----------------------------------
	
 public static int scannerforinteger() 
 {
	 Scanner s=new Scanner(System.in);
     
	 System.out.println("enter int value");
     int n = s.nextInt();
     return n;
	
 }
////////////////////////////---------------------------------------
 public static String dayofweek() throws ParseException
{
	 Scanner sc=new Scanner(System.in);
     int year=sc.nextInt();
     int month=sc.nextInt();
     int day=sc.nextInt();
     String dateString = String.format("%d-%d-%d", year, month, day);
     Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
     
     
     String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

     //System.out.println(dayOfWeek);
     //throws parse exception
	return dayOfWeek;
}
/////////////////////////////////---------------------------------
 public static String scanstring() 
 {
	 Scanner sc=new Scanner(System.in);
	 String get=sc.next();
	 return get;
 }
     

	
///////////////////////////-------------------------------------------	
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String stringvalue=scanner.next();
		int number = scanner.nextInt();
		palindrome(number);
		prime(number);
	    anagram(stringvalue);
	    scannerarrayint();
	    scannerforinteger();
	    dayofweek();
	    scanstring();

	}
}