package com.bridgelabz.datastructureprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.QueuePalindrome;

public class Palindrome 
{
      public static void main(String[] args)
      {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a string.. ");
		   String value=sc.next();
		   String[] array=value.split("");
		    int len=array.length;
		   QueuePalindrome que=new QueuePalindrome();
		   que.setSize(len);
		   que.enque(array);
		   
		  
	}
}
