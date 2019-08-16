package com.bridgelabz.designpattern.prototypedesign.implementation;

import com.bridgelabz.designpattern.prototypedesign.myinterface.ProtoType;

public class EmployeeRecord implements ProtoType 
{
	   private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	   public EmployeeRecord() 
	   {
		
	   }
	   public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	 public void show()
	 {
	    System.out.println(id+" "+name+" "+designation+" "+salary+" "+address);	
	 }  
	@Override
	public ProtoType getclone() {
		
		return new EmployeeRecord(id, name, designation, salary, address);
	}
	   
}
