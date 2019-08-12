package com.bridgelabz.oops.readwrite.myclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.readwrite.pojo.TestModelForIDM;


public class TestRead {
	public static void main(String[] args) throws IOException, ParseException {
		
		ObjectMapper objMapper = new ObjectMapper();
		InputStream inptStream = new FileInputStream(new File("/home/admin1/Desktop/regex.json"));
		TypeReference<List<TestModelForIDM>> typeReference = new TypeReference<List<TestModelForIDM>>() {
		};
		List<TestModelForIDM> modles = objMapper.readValue(inptStream, typeReference);

		System.out.println("Enter Name");
		Scanner sc=new  Scanner(System.in);
		String Name = sc.nextLine();
		for (TestModelForIDM m : modles) {
			if(m.getName().equalsIgnoreCase(Name)) {
				System.out.println(m);
			}
		}
	}
}



/*
 * JSONParser jsonParser = new JSONParser(); FileReader fr = new
 * FileReader("/home/admin1/Desktop/inventarymanagement.json"); Object obj =
 * jsonParser.parse(fr); JSONArray js = (JSONArray) obj;
 * 
 * for (Object object : js) { System.out.println(object);
 * 
 * }
 */
