package com.bridgelabz.oops.addressbook.mymain;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.addressbook.interfaceimplementation.AddressRepository;

public class AddressService extends AddressRepository
{
	
  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
  {
	 
	AddressRepository addrepo=new AddressRepository();
	
	System.out.println("Welcome..");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for Add ");
    System.out.println("Enter 2 for Edit ");
    System.out.println("Enter 3 for removing ");
    System.out.println("Enter 4 for Sorting ");
	int request=sc.nextInt();
    AddressService addservice=new AddressService();	
	switch (request) 
	{
	case 1:
		addservice.add();
		break;
	case 2:
		addservice.edit();
		break;
	case 3:
		addservice.removedata();
		break;
	case 4:
		addservice.sortinglist();
		break;
	default:
		break;
	}
	
}
}
