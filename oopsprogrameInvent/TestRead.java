package com.bridgelabz.oopsprogrameInvent;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestRead 
{
  @SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException, ParseException 
  {
		/*
		 * ObjectMapper mapper = new ObjectMapper(); InputStream
		 * input=Dto.class.getResourceAsStream(
		 * "/home/admin1/Desktop/inventarymanagement.json"); // File file = new File(
		 * "/home/admin1/Anshuman_bridgelabz/BridgelabzProgram/src/com/bridgelabz/oopsprogrameInvent/demo.json"
		 * );
		 * 
		 * Dto mdm; try { mdm = mapper.readValue(input, Dto.class);
		 * 
		 * System.out.println(mdm); } catch (Exception e) { System.out.println(e); }
		 */	  
	  JSONParser jsonParser = new JSONParser();
	  FileReader fr=new FileReader("/home/admin1/Desktop/inventarymanagement.json");
	  Object obj=jsonParser.parse(fr);
	  JSONArray js=(JSONArray)obj;
	 
	  for (Object object : js) 
	  {
		System.out.println(object);
		
	  }
	}
}

