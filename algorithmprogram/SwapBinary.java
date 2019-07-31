package com.bridgelabz.algorithmprogram;

public class SwapBinary 
{	
	 
   public static void main(String[] args) 
   {
	   int numbinary[]=new int[10];
	   int demo=47;
	   int i=0;
	   while (demo > 0)
	   {
		    
		   numbinary[i] =demo % 2;
		   
		    demo=demo / 2;
		        i++;
	   }
	   for (int j = i; j >= 0; j--) 
	   {
		System.out.print(numbinary[j]);
	   }
	   System.out.println();
	   
	   System.out.println();
	   double temp=0;
	   
	   for (int k = 0; k <= i; k++)
	   {
	      double decvalue = numbinary[k]*Math.pow(2, k);
          		   
	      temp = temp + decvalue;
	   }
		
	   System.out.println(temp);
   }
}