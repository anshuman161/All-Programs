package com.bridgelabz.oopsprogrameJsonUtil;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReadWrite 
{
 public static void main(String[] args) {
	 JSONObject employeeObject = new JSONObject();
     employeeObject.put("companyname", "TaTa"); 
	 
	 JSONObject employeeDetails = new JSONObject();
      employeeDetails.put("sharename", "Steel");
      employeeDetails.put("noofshare", 20);
      employeeDetails.put("shareprice", 60);
       
      JSONObject employeeObject1 = new JSONObject();
      employeeObject1.put("companyshare", employeeDetails);
       
		/*
		 * //Second Employee JSONObject employeeDetails2 = new JSONObject();
		 * employeeDetails2.put("firstName", "Brian"); employeeDetails2.put("lastName",
		 * "Schultz"); employeeDetails2.put("website", "example.com");
		 * 
		 * JSONObject employeeObject2 = new JSONObject();
		 * employeeObject2.put("employee", employeeDetails2);
		 */       
      //Add employees to list
      JSONArray employeeList = new JSONArray();
      employeeList.add(employeeObject);
      employeeList.add(employeeObject1);
       
      //Write JSON file
      try (FileWriter file = new FileWriter("/home/admin1/Desktop/userdetails.json")) 
      {

          file.write(employeeList.toJSONString());
          file.flush();

      } catch (IOException e) {
          e.printStackTrace();
      }
}
}
