package com.bridgelabz.utility;

public class Queue<T> 
{
  int arr[]=new int[50];
  int front;
  int rear;
  int size=11;
  T[] data; 
  public void addrear(T data)
  {
	 if (rear==size)
	 {
	  System.out.println("overflow");	
	 }
	 else
	 {
		  arr[rear]=(int) data;
			 rear++;
          	         
	 }
  }
	public void removerear()
	{
		if (front==rear)
		{
		  System.out.println("underflow");	
		}
		 rear=rear-1;
          arr[rear]=0;		
		 
	} 
	
	public void addfront(T data)
	{
		 if (rear==size)
		 {
		  System.out.println("overflow");	
		}
		 else 
		 {
			for (int i = rear; i > front; i--) 
			{
			  arr[i]=arr[i-1];	
			}
			arr[front]=(int) data;
			rear=rear+1;
		 }
	}
	
	public void removefront()
	{
		if (front==rear)
		{
		  System.out.println("underflow");	
		}
		else {
		   arr[front]=0;
		   front++;
		}
			 		
	} 
	
	public int sort(int data)
	{
		int temp;
		
		for (int k = 0; k < size; k++) 
		{
			for (int h = 0; h < size-1; h++)
			{
			       if (arr[h]>arr[h+1])
			       {
					  temp=arr[h];
					  arr[h]=arr[h+1];
					  arr[h+1]=temp;
				   }	
			}
		}
		return data;
	}
	
	public void put()
	{
	  	
	}
	
  public void show()
  {
	  System.out.println("Element : ");
	  for (int i = 0; i < size; i++) 
	  {
		System.out.println(arr[i]+" ");
	}
	  }
	
}
