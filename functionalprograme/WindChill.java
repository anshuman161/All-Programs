package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class WindChill 
{
	public static void chill(double t,double v)
	{
		        
		
		if (t > 50 || v > 120 || v < 3 )
		{
		      	System.out.println("Not Valid");
		}
		else {
			System.out.println("temperature t (in Fahrenheit)         ="+t);
   			System.out.println("the wind speed v (in miles per hour)  ="+v);
			double w=35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("wildchill                             ="+w);
			
		}
	}
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	  double t=s.nextDouble();
	  double v=s.nextDouble();
      chill(t,v);   	
}
}