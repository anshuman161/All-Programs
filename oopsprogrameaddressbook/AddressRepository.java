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
import java.util.TreeSet;

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
public class AddressRepository implements AddressBook
{
	Scanner sc = new Scanner(System.in);
	
	// objectmapper give us the functionality to write and read file by write n read methods
	ObjectMapper objmapper = new ObjectMapper();
	
	File file = new File("/home/admin1/Desktop/addressbook.json");// this is json file
	
	// typereference provide the type in which we are parsing
	TypeReference<ArrayList<AddressModel>> typeReference = new TypeReference<ArrayList<AddressModel>>() {
	};
	ArrayList<AddressModel> pojoread; // we are passing file n rfrnc
	ArrayList<AddressModel> addressdata=new ArrayList<AddressModel>(); 
	
	// This method is using for sorting n searching
	public void sortinglist() throws JsonParseException, JsonMappingException, IOException {
		 Comparator<AddressModel> bytype=new Comparator<AddressModel>() {
						  
			  @Override public int compare(AddressModel o1, AddressModel o2) 
			  {
				  System.out.println("sortiiiing");
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
	       Collections.sort(addressdata, bytype);
		objmapper.writeValue(file, pojoread);
	}

	// overriden method for remove
	@Override
	public void removedata()  {
		try {
			pojoread = objmapper.readValue(file, typeReference);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter first name ");
		String first2 = sc.next();

		for (AddressModel addressPojo : pojoread) {
			if (addressPojo.getFirstname().equals(first2)) 
			{
				pojoread.remove(addressPojo); // remove is a method of arraylist

			}
		}
		try {
			objmapper.writeValue(file, pojoread);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// This is overriden method for adding some data
	@Override
	public void add() {
		try {
			pojoread = objmapper.readValue(file, typeReference);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddressModel addpojo = new AddressModel();
        //we are setting values thru pojo object
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
		try {
			objmapper.writeValue(file, pojoread);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
   
	
	// this method is using for edit purpose
	@Override
	public void edit() {
		try {
			pojoread = objmapper.readValue(file, typeReference);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter first name ");
		String first1 = sc.next();

		for (AddressModel addressPojo : pojoread) 
		{
			if (addressPojo.getFirstname().equals(first1)) 
			{
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
		try {
			objmapper.writeValue(file, pojoread);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
	/*
	 * public void mysort() throws JsonParseException, JsonMappingException,
	 * IOException { System.out.println("11111111111");
	 * 
	 * System.out.println("2222222222"); pojoread = objmapper.readValue(file,
	 * typeReference); TreeSet<AddressModel> trees=new TreeSet<AddressModel>(new
	 * Comparator<AddressModel>() {
	 * 
	 * @Override public int compare(AddressModel o1, AddressModel o2) { if
	 * (o1.getZip()>o2.getZip()) { return 1; } else if(o1.getZip()<o2.getZip()) {
	 * return -1; } else { return o1.getFirstname().compareTo(o2.getFirstname()); }
	 * } }); System.out.println("33333333"); trees.addAll(pojoread);
	 * System.out.println(trees);
	 * 
	 * }
	 */
}