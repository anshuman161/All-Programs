package com.bridgelabz.algorithmprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Mathpracto {
	int max=5;
	
	
	public static void main(String[] args)
	{
     int arr[]= {1,2,3,45,6,7,8,9,62,56,22};
     int len=arr.length;
     int count=1;
     Set st=new HashSet(); 
     while(count < 6) {
    	 int rnd=new Random().nextInt(len);
    	 
         st.add(arr[rnd]);
		count++;
             
       if (String.valueOf(st).length()!=5)
       {
		    System.out.println(st);
	    }     
     }
	}
	}

