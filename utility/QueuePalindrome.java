package com.bridgelabz.utility;

public class QueuePalindrome
{
  String data;
  int size;
 
	public void setSize(int size) 
	{
		this.size = size;
	}
	String demo1=""; 
	String demo=""; 
	


  public void enque(String[] data)
  {
	   
	  for (int i = size-1; i >= 0; i--) 
	     {
			       demo=demo+data[i];
	    	       
		 }
	 
	  for (int i = 0; i < size; i++) 
	  {
		    demo1=demo1+data[i];  
	  }
	 
	   if (demo.equals(demo1))
	   {
		  System.out.println("Yes ! This is palindrome");
	   }
	   else {
		System.out.println("No ! This is not palindrome");
	}
	       
  }
}
