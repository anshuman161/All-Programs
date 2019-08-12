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

public class TestReadWriting {
	public void readwritemethod() {
		try {
		ObjectMapper objMapper = new ObjectMapper();
		File file=new File("/home/admin1/Desktop/Inventory.json");
		InputStream inptStream = new FileInputStream(file);
		TypeReference<List<TestModelForIDM>> typeReference = new TypeReference<List<TestModelForIDM>>() {
		};
		List<TestModelForIDM> modles = objMapper.readValue(inptStream, typeReference);
		TestModelForIDM model=new TestModelForIDM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter share name");
		String sname=sc.next();
		model.setName(sname);
		
		System.out.println("Enter price");
		int price=sc.nextInt();
		model.setPrice(price);
		
		System.out.println("Enter weight");
		float weight=sc.nextFloat();
		model.setWeight(weight);
		modles.add(model);
		objMapper.writeValue(file, modles);
		for (TestModelForIDM m : modles) {
			System.out.println(m);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
