package com.bridgelabz.utility;

public class MyStack 
{
	int size;
	int top = -1;

	
	  public int getSize() { return size; }
	  
	  public void setSize(int size) { this.size = size; }
	 
       
	char chr[] = new char[50];

	public void pushandpop(char[] ch)
	{
        
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == '(' || ch[i] == ')') 
			{

				if (ch[i] == '(')
				{
                      
					push(ch[i]);

				} 
				else if (ch[i] == ')' && chr[top]=='(' ) 
				{
					pop();
				}
				/*
				 * else if (ch[i]==')' && chr[top]==')') { System.out.println("Not balanced"); }
				 */					
				
			  }
			}
		}
	
	
	public boolean isFull()
	{
	  if (top==size)
	  {
		 return true;
	  }	
	  else
	  {
		  return false;
	  }
	}
   
	public void push(char c1) {

		if (isFull())
		{
			System.out.println("Stack is full");
			
		} 
		else
		{
			top=top+1;
            chr[top]='(';

		}
	}

	public void pop()
	{
		if (isEmpty())
		{
			System.out.println("stack underflow");
			
		}
		else
		{
			top=top-1;

		}
	}

	
	  public char peek() {
	  
	  return chr[top];
	  
	  }
	 
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} 
		else
		{

			return false;
		}
	}
}
  
  
   
/*public class MyStack
{
  ListNode top;
  int size;
  
  
  
  
 

class ListNode<T>
  {
	   T data;
	   ListNode next;
	   
	   public ListNode(T data2) 
	   {
		  this.data=(T) data2;
	   }
  }
  public MyStack()
  {
   top=null;
   size=0;
  }
  public int size()
  {
	return size;
	  
  }
  public boolean isEmpty()
  {
	  return size==0;
  }
  public <T> void push(T data)
  {
	  ListNode<T> temp=new ListNode<T>(data);
	     temp.next=top;
	     top=temp;	  
	     size++;
  }
  public<T>char pop()
  {
	  if (isEmpty())
	  {
		System.out.println("Empty..");
	  }
	  T result=(T) top.data;
	    top=top.next;
	  System.out.println(result);
	  return (char) result;
	  
  }
  public char peek()
  {
	  if (isEmpty())
	  {
		System.out.println("Empty..");
	  }
	   return (char) top.data;
	 
  }
  
	public void pushandpop(char[] ch) {

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' || ch[i] == ')') {

				if (ch[i] == '(') {
                  
					push(ch[i]);

				} else if (ch[i] == ')') {
					char arr = peek();

					if (ch[i] != arr) {
						pop();
					}
					else
					{
					push(ch[i]);
					}
				}
			}
		}
	}
 */ 

