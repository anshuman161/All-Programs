package com.bridgelabz.oopsprogrameInvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class TestReadWriting {
	public static void main(String[] args) throws IOException, ParseException {

		ObjectMapper objMapper = new ObjectMapper();
		File file=new File("/home/admin1/Desktop/Inventory.json");
		InputStream inptStream = new FileInputStream(file);
		TypeReference<List<ModelForIDM>> typeReference = new TypeReference<List<ModelForIDM>>() {
		};
		List<ModelForIDM> modles = objMapper.readValue(inptStream, typeReference);
		ModelForIDM model=new ModelForIDM();
		model.setName("sugar");
		model.setPrice(32);
		model.setWeight(14.0F);
		modles.add(model);
		objMapper.writeValue(file, modles);
		for (ModelForIDM m : modles) {
			System.out.println(m);
		}
	}
}
