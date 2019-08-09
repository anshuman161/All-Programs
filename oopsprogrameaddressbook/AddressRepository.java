package com.bridgelabz.oopsprogrameaddressbook;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;

import com.bridgelabz.pojoimplementation.AddressModel;

//This is a class where some methods are there for addition deletion n all
public class AddressRepository {
	Scanner sc = new Scanner(System.in);
	ArrayList<AddressModel> pojoread; // we are passing file n rfrnc
	// objectmapper give us the functionality to write and read file
	ObjectMapper objmapper = new ObjectMapper();
	File file = new File("/home/admin1/Desktop/addressbook.json");// this is json file
	// typereference provide the type in which we are parsing
	TypeReference<ArrayList<AddressModel>> typeReference = new TypeReference<ArrayList<AddressModel>>() {
	};

	
	public ArrayList<AddressModel> m1() throws JsonParseException, JsonMappingException, IOException {
		
		pojoread = objmapper.readValue(file, typeReference);
		return pojoread;
	}
	// This is first method for adding some data
	@SuppressWarnings("unchecked")
	public void add() throws JsonGenerationException, JsonMappingException, IOException {

		pojoread = objmapper.readValue(file, typeReference);
		AddressModel addpojo = new AddressModel();

		System.out.println("Enter id in number formats");
		int id0 = sc.nextInt();

		addpojo.setId(id0);
		System.out.println("Enter first name ");
		String first0 = sc.next();
		addpojo.setFirstname(first0);
		System.out.println("Enter last name ");
		String last0 = sc.next();
		addpojo.setLastname(last0);
		System.out.println("Enter phone number ");
		long phone0 = sc.nextLong();
		addpojo.setMobileno(phone0);
		System.out.println("Enter city ");
		String city0 = sc.next();
		addpojo.setCity(city0);
		System.out.println("Enter zip code");
		int zip0 = sc.nextInt();
		addpojo.setZip(zip0);
		pojoread.add(addpojo);
		objmapper.writeValue(file, pojoread);

		// System.out.println(.getId()+" "+addpojo.getFirstname()+"
		// "+addpojo.getLastname()+" "+addpojo.getMobileno()+" "+addpojo.getCity()+"
		// "+addpojo.getZip());
	}

	////////// ----------------------------------
	// this method is using for edit purpose
	@SuppressWarnings("unused")
	public void edit() throws JsonParseException, JsonMappingException, IOException {

		pojoread = objmapper.readValue(file, typeReference);

		System.out.println("Enter first name ");
		String first1 = sc.next();

		for (AddressModel addressPojo : pojoread) {
			if (addressPojo.getFirstname().equals(first1)) {
				System.out.println("Enter phone number ");
				long phone1 = sc.nextLong();
				addressPojo.setMobileno(phone1);

				System.out.println("Enter city name ");
				String city1 = sc.next();
				addressPojo.setCity(city1);

				System.out.println("Enter zip code");
				int zip1 = sc.nextInt();
				addressPojo.setZip(zip1);
			}
		}
		objmapper.writeValue(file, pojoread);

	}

	public void removedata() throws JsonParseException, JsonMappingException, IOException {
		pojoread = objmapper.readValue(file, typeReference);

		System.out.println("Enter first name ");
		String first2 = sc.next();

		for (AddressModel addressPojo : pojoread) {
			if (addressPojo.getFirstname().equals(first2)) {
				pojoread.remove(addressPojo); // remove is a method of arraylist

			}
		}
		objmapper.writeValue(file, pojoread);

	}
   
	
	////-----

	  
	 
///////---------
	
	
	// This method is using for sorting n searching
	public void sortinglist() throws JsonParseException, JsonMappingException, IOException {
		 Comparator<AddressModel> bytype=new Comparator<AddressModel>() {
				
			  
			  @Override public int compare(AddressModel o1, AddressModel o2) 
			  {
				   if (o1.getZip()>o2.getZip())
				   {
					  return 1;
				   }
				   else if(o1.getZip()<o2.getZip())
				       {
					  return -1;
				       }
				   else {
					      return o1.getFirstname().compareTo(o2.getFirstname());
				         }
		         
					
				}
			};
		
		
		
	AddressModel admodel=new AddressModel();
	       Collections.sort(pojoread, bytype);
		//objmapper.writeValue(file, pojoread);
	}
	

}