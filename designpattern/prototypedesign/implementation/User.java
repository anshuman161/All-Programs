package com.bridgelabz.designpattern.prototypedesign.implementation;

public class User {
	public static void main(String[] args) 
	{
		
      EmployeeRecord erecord=new EmployeeRecord(01, "ram", "god",  000, "ayodhya");    
      erecord.show();
      EmployeeRecord erdemo=(EmployeeRecord)erecord.getclone();
      erdemo.show();
	  
	}
}
