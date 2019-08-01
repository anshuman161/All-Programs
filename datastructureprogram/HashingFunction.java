package com.bridgelabz.datastructureprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.Deque;
import com.bridgelabz.utility.LinkedList2;

public class HashingFunction 
{
  public static void main(String[] args) throws FileNotFoundException
  {
	Deque<Integer> de=new Deque<Integer>();
	HashingFunction[] hf=new HashingFunction[11];
	          int[] array=new int[11];
       	      int data = 0;
	          String demo = "";
	  		File f = new File("/home/admin1/Desktop/tennumbers.txt");
	  		Scanner sc = new Scanner(f);

	  		while (sc.hasNextLine())
	  		{
	  			demo = sc.nextLine();
	  		}
	  		String[] arr = demo.split(" ");
            for (int i = 0; i < arr.length; i++)
            {
				           int num=Integer.parseInt(arr[i]);
				           data=num%11;
				           
				           de.addrear(num);
			}
            
            
            LinkedList2 ls=new LinkedList2();
                        	       
            
            int values=de.sort(data);
                         
            
            
             
            de.show();
            
            
  }
}
