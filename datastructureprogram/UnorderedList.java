package com.bridgelabz.datastructureprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedList;
/**
 * 
 * 
 * **/
public class UnorderedList 
{
  public static void main(String[] args) throws IOException 
  {
	
	  String line=" ";
	  File f = new File("/home/admin1/Desktop/xyz.txt");
		Scanner sc = new Scanner(f);

		while (sc.hasNextLine())
        {
			line = sc.nextLine();
		}
		    String[] str = line.split(" ");
		   
		  
		    LinkedList list = new LinkedList();
		    
		 for (int i = 0; i < str.length; i++) 
		{
			list.insert(str[i]);   //Method from linkedlist
		}
		list.show();
		
		
		Scanner sc1 = new Scanner(System.in);
		String sname = sc1.next();

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
		FileOutputStream fis=new FileOutputStream("/home/admin1/Desktop/xyz.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fis);
		obj.writeObject(list);
		list.show();		
		  
  }     
}