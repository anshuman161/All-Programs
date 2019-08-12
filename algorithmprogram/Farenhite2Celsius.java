package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.MyUtil;

public class Farenhite2Celsius
{
   public static void Converttemp() 
   {
	   double F,C;
		  System.out.println("input a degree in celsius");
		 double demo=MyUtil.scannerforinteger();
	           F = (demo * 9/5) + 32 ;
		    System.out.println("Temperature converted into Fahrenheit "+F );
		  System.out.println();
		    System.out.println("input a degree in Ferenheit");
		    double demo1=MyUtil.scannerforinteger();
		            C= (F - 32) * 5/9 ;
		             System.out.println("Temperature converted into Celsius "+C);

   }  
  public static void main(String[] args)
  {
        Converttemp();	        
	  }
}