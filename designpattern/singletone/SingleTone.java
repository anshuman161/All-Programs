package com.bridgelabz.designpattern.singletone;
//
public class SingleTone {
//1.	//eager initialization
	//1//private static SingleTone single = new SingleTone(); 
//2.   //lazy initialization
	private static SingleTone single=null;               

	private SingleTone() //to create singleton
	{
	}

	
	
	public static SingleTone getSingleTone()
	{
	//1. 
		//return single;
	//2.
		if (single==null)
		{
		  single=new SingleTone();	
		}
		return single;
		
	}
	public static void main(String[] args) {
	  SingleTone s=SingleTone.getSingleTone();
	  System.out.println(s);
	  SingleTone s1=SingleTone.getSingleTone();
      System.out.println(s1);
      SingleTone s3=SingleTone.getSingleTone();
      System.out.println(s3);
      
	}
}
//class is not final but we are not allow to create child class ..how it is possible???
//->declare every constructor as a private.!!!

//
