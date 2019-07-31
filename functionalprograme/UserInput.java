package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class UserInput 
{
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    if (s.length()>=3) {
	    	String s1="hello <<username>>,how are you";
	        String s2=s1.replaceAll("<<username>>", s);
	        System.out.println(s2);	
		}
   

	    
}
}