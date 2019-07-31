package com.bridgelabz.utility;

public class Deque<T> 
{
  int front;
  int rear;
  int size;
  T[] data;
  T[] demo;
  public void addfront(T[] data)
  {
	     demo=data;
	     front=front+1;
	     size=size+1; 
  }
  public void addrear(T[] data)
  {
	     demo=data;
	     rear=rear+1;
	     size=size+1;
  }
  public void removefront()
  {
	  front=front-1;
	  
	  
  }
}
