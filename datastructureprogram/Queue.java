package com.bridgelabz.datastructureprogram;

public class Queue
{
  String data;
  int size;
  int front;
  int rear;
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	String demo1=""; 
	String demo=""; 
	/*
	 * String[] demo1; String[] demo;
	 * 
	 * public void enqueue(String[] array) { for (int i = 0; i < array.length; i++)
	 * {
	 * 
	 * demo[rear]=array[i]; rear=rear+1; size=size+1; } } public void
	 * dequeue(String[] data) { for (int i = size-1; i >=0; i--) {
	 * demo1[front]=demo[i]; front=front+1; } } public boolean palind() { if
	 * (demo1.equals(demo)) { return true; } else { return false; }
	 * 
	 * }
	 */


  public void deque(String[] data)
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
