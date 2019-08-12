package com.bridgelabz.oops.addressbook.interfaceimplementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oops.addressbook.pojo.AddressModel;

public class Addresswrite 
{
	@SuppressWarnings(value = "unchecked")
	public void jsonwrite()
	{
		Scanner sc = new Scanner(System.in);
		AddressModel addpojo = new AddressModel();
		JSONObject json = new JSONObject();
		System.out.println("Enter deails");
		System.out.println("Enter id");
		int id = sc.nextInt();
		addpojo.setId(id);
		System.out.println("Enter first name");
		String firstname = sc.next();
		addpojo.setFirstname(firstname);      
		System.out.println("Enter last name");
		String lastname = sc.next();
		addpojo.setLastname(lastname);
		System.out.println("Enter phone no");
		long phoneno = sc.nextLong();
		addpojo.setMobileno(phoneno);
		System.out.println("Enter city");
		String city = sc.next();
		addpojo.setCity(city);
		System.out.println("Enter zip");
		int zip = sc.nextInt();
		addpojo.setZip(zip); 
        
        JSONObject json2=new JSONObject();
        json2.put("employee", addpojo);
        
       JSONArray jarray=new JSONArray();
       jarray.add(json2);
       FileWriter filewriter;
       try {
		filewriter=new FileWriter("/home/admin1/Desktop/addressbook1.json");
		filewriter.write(jarray.toJSONString());
		filewriter.flush();
	}
       catch (IOException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
       }
	}
	public static void main(String[] args) 
	{
		Addresswrite aw=new Addresswrite();
		aw.jsonwrite();
	
}
}     
	
