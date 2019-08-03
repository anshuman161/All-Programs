package com.bridgelabz.datastructureprogram;

import java.util.Scanner;

public class BankingCashCounter 
{
 public static void main(String[] args) 
	{
		QueueList qlist=new QueueList();
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of people ...");     
		int size=sc.nextInt();
		
		
		
		qlist.push(size);             
		System.out.println();
		qlist.moneybalance();
		
	}
                        
}

class QueueList
{
	int top=0;
	
	int money=0;    
    int amount=0;  
	
    
	public void push(int size)
	{
	  	System.out.println(size);
	   if (top == size)
	   {
		   System.out.println("No of people is overflow");
	   }
	   else
	   {
	           for (int i = 1; i <= size; i++)
	           {
				  System.out.println(i+" no of people");
				  Scanner sc=new Scanner(System.in);
				  System.out.println("What do you want to do- withdraw or deposite :- ");
				  int request=sc.nextInt();
				  switch (request)
				  {
				case 333:
					  money=money+sc.nextInt();
                 	   System.out.println("Cash = "+money);
					
					break;
				case 666:
					 int rupees=sc.nextInt();
               	  if (money >= rupees)
               	  {
                      		  money=money-rupees;
                      		 System.out.println("Cash = "+money);
               	  }
               	  else 
               	  {
               		   amount=money-rupees;
						System.out.println("Cash is not available.");
					  }
						  
					
					break;
				
				}
				  //System.out.println(request);
				/*
				 * if (request.equalsIgnoreCase("deposite")) { money=money+sc.nextInt();
				 * System.out.println("Cash = "+money); } else if
				 * (request.equalsIgnoreCase("withdraw")) { int rupees=sc.nextInt(); if (money
				 * >= rupees) { money=money-rupees; System.out.println("Cash = "+money); } else
				 * { amount=money-rupees; System.out.println("Cash is not available."); }
				 * 
				 * }
				 */
                  top++;
			   }	      
	   }
	}
	
	public void pop() 
	{
		if (top == 0)
		{
			System.out.println("no of people is underflow");
		} 
		else
		{
			top--;
			
		}
	} 
	
	public void moneybalance()
	{
	    if (amount >=0 )
	    {
		  System.out.println("Money is balanced");	
		}	
	    else 
	    {
		  System.out.println("Money is not balanced");	
		}
	}
    
}
