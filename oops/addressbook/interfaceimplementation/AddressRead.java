package com.bridgelabz.oops.addressbook.interfaceimplementation;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressRead
{ 
	
 
	public static void main(String[] args) {
		
	
		System.out.println("00000000");
		 JSONParser jparser = new JSONParser();
		 System.out.println("22222");
		 try (FileReader reader = new FileReader("/home/admin1/Desktop/jsonobject.json"))
	        {
	           
			 System.out.println("333333");
			 JSONObject jsonobject =(JSONObject) jparser.parse(reader);
	            System.out.println("111111");
	            
	          int id = (int) jsonobject.get("id");
	      	  System.out.println(id);
	            String firstname = (String) jsonobject.get("firstname");
	            System.out.println(firstname);
	            String lastname = (String) jsonobject.get("lastname");
	            System.out.println(lastname);
	            long mobileno = (long) jsonobject.get("phoneno");
	            System.out.println(mobileno);
	            String city = (String) jsonobject.get("city");
	            System.out.println(city);
	            int zip = (int) jsonobject.get("zip");
	            System.out.println(zip);
	            
	            JSONArray jarray=(JSONArray)jsonobject.get("employee");
	             
	            Iterator itr=jarray.iterator();
	            while (itr.hasNext()) {
				System.out.println(itr.next());
				
			}
	        }
		 catch (Exception e)
		 {
			e.printStackTrace();
		}
	           
	            
	         
	}	
	
		
}
