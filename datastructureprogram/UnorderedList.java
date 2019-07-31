package com.bridgelabz.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedList;

public class UnorderedList 
{
  public static void main(String[] args) 
  {
	  FileReader file = null;
		try {
			 file = new FileReader(new File("/home/admin1/Desktop/xyz.txt"));
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		   BufferedReader bfr = new BufferedReader(file);
		   String line = null;
		try {
			line = bfr.readLine();
		} 
		catch (IOException e)
		{
		
			e.printStackTrace();
		}
		    String[] str = line.split(" ");
		   
		    String value="";
		    LinkedList list = new LinkedList();
		    
		 for (int i = 0; i < str.length; i++) 
		{
			list.insert(str[i]);   //Method from linkedlist
		}
		list.show();
		
		
		Scanner sc = new Scanner(System.in);
		String sname = sc.next();
		//list.search(list.head, sname);
		boolean flag=true;
		  for (int i = 0; i < str.length; i++) 
		  { 
			  
			  if (sname.equals(str[i])) 
			  {
		      list.removeatindex(i);
		      flag=false;//Method from linkedlist
		     }
		  }
		  if (flag) 
		  {
			
			  list.insert(sname);  
			     
		  }
		 
		  list.show();
		
		
  }     
}