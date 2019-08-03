package com.bridgelabz.datastructureprogram;
/**
 * A class that define prime no 
 * 
 * **/
public class PrimeNumber 
{
	public static void getprime(int value)
	{
		
		boolean flag=true;
		for (int i = 2; i <= 1000; i++)
		{
		        if (i%2==0)
		        {	
				    flag=false;
		        }
		        else
		        {
		        	 for (int j = 2; j <= i-1; j++)
					  {
						   if (i % j ==0)
						   {
							      
						   }
						 
						   
					  }
		        	 
		        }
		}
	}
	
	
  public static void main(String[] args) {
	int value=1000;
	getprime(value);
}
}
