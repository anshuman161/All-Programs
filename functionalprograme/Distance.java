package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class Distance 
{
	static int dist(int x,int y)
	{
		 
		 double distance = Math.sqrt(x*x + y*y);
		 
		 System.out.println("distance from point ("+x+","+y+") to the originto (0, 0) = " + distance);
		return (int) distance;
	    
	    	
	}
	
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	 int x=s.nextInt();
	 int y=s.nextInt();
	 dist(x, y);
  }
}