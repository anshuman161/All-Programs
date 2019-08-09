package com.bridgelabz.oopsprogrameaddressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.pojoimplementation.AddressModel;

public class AddressService
{
	
  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
  {
	 
	    AddressRepository addrepo=new AddressRepository();
	
	System.out.println("Welcome..");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for Add ");
    System.out.println("Enter 2 for Edit ");
	System.out.println("Enter 3 for Sorting ");
	int request=sc.nextInt();
    	
	switch (request) 
	{
	case 1:
		addrepo.add();
		break;
	case 2:
		addrepo.edit();
		break;
	case 3:
		addrepo.sortinglist();
		break;
	default:
		break;
	}
	
}
}
