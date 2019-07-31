package com.bridgelabz.utility;
public class MyStack {
	int size;
	int top = -1;
   
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	char chr[] = new char[size];

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
			else if (ch[i] == ')') 
			{
				char arr=peek();
				
				if (ch[i]==arr) 
				{
					push(ch[i]);
				}
				pop();
					
			}
		  }
		}	 
	}

	public void push(char c1) {
	
		if (top == size) 
		{
			System.out.println("Stack overflow");
              return;
		} 
		else
		{

			chr[++top] = c1;
			
		}
	}

	public char pop() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} 
		else 
		{
			char element = chr[top];
			top--;
			return element;
			
		}
	}
	public char peek()
	{
		  
		return chr[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {

			return false;
		}
	}
	
}