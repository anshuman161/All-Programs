package com.bridgelabz.oopsprogrameInvent;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oopsprogrameJsonUtil.MyJsonUtil;

public class TestWriting 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		JSONObject details = new JSONObject();
            details.put("name", "Rice");
            details.put("weight", "2 kg");
            details.put("price", "200");
            
            JSONObject obj = new JSONObject();
            obj.put("Rice", details);
          
            JSONObject details1 = new JSONObject();   
            details1.put("name", "Pulses");
            details1.put("weight", "1 kg");
            details1.put("price", "100");
            
            JSONObject obj1 = new JSONObject();
            obj1.put("Pulses", details1);
            
            JSONObject details2 = new JSONObject();   
            details2.put("name", "Wheats");
            details2.put("weight", "1 kg");
            details2.put("price", "180");
           
            JSONObject obj2 = new JSONObject();
            obj2.put("Wheats", details2);
            //add details to list
            JSONArray list=new JSONArray();
            list.add(obj);            
            list.add(obj1);
            list.add(obj2);
		
            MyJsonUtil.javatojson(list);
            
            //write in files
            FileWriter file;
            try {
            	//file=new FileWriter("/home/admin1/Desktop/inventarymanagement.json");
            	file=new FileWriter("/home/admin1/Anshuman_bridgelabz/BridgelabzProgram/src/com/bridgelabz/oopsprogrameInvent/demo.json");
            	file.write(list.toJSONString());
            	file.flush();
            	System.out.println("successfull");
			     } 
                 catch (IOException e)
                 {
				e.printStackTrace();
			     }
                   
	}
}
