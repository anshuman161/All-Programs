package com.bridgelabz.algorithmprogram;

public class SqrtFunction 
{
		
  public static void main(String[] args) {
	   double t,c;
	   c=100;
	   System.out.println(c);
	   t=c;
	   double epsilon = 1^ -15;
	 
	 while (Math.abs(t - c/t) > epsilon*t) 
	 {
         t = (c/t + t) / 2.0;
     }
	 System.out.println(t);
	 
}
}