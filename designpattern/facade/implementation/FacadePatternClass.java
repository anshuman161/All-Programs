package com.bridgelabz.designpattern.facade.implementation;

import java.util.Scanner;

public class FacadePatternClass extends ShopKeeper
{
  public static void main(String[] args) 
  {
	FacadePatternClass facade=new FacadePatternClass();
	   System.out.print("========= Mobile Shop ============ \n");  
       System.out.print("            1. IPHONE.              \n");  
       System.out.print("            2. SAMSUNG.              \n");  
       System.out.print("            3. BLACKBERRY.            \n");  
       System.out.print("            4. Exit.                     \n");  
       System.out.print("Enter your choice: ");  	  
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	switch (choice) {
	case 1:
		facade.iphonesell();
		break;
	case 2:
		facade.samsungsell(); 
		break;
	case 3:
		facade.blacksell();
		break;

	default:
		break;
	}
}
}
