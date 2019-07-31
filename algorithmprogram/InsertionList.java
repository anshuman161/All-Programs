package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

public class InsertionList 
{
	
	public static void insertlist()
	{
		   Scanner sc=new Scanner(System.in);
		   String str=sc.nextLine();
		   String[] strarray=str.split(" ");
		   
			
			String demo = "";
			int temp, j;
			for (int i = 1; i < strarray.length; i++) {
				demo = strarray[i];
				j = i;
				while (j > 0 && demo.compareTo(strarray[j - 1]) < 0) {
					strarray[j] = strarray[j - 1];
					j = j - 1;

				}
				strarray[j] = demo;
			}
			for (int i = 0; i < strarray.length; i++) {
				System.out.println(strarray[i]);
			}	
	}
   public static void main(String[] args)
   {
	   
	
		 insertlist();
}
}
