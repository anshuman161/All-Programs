package com.bridgelabz.oops.commercialdataprocessing.mymain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.oops.commercialdataprocessing.pojo.CompanyDetails;
import com.google.gson.Gson;

public class WriteToJsonFile 
{
	public void writetojson(List<CompanyDetails> addmodel) 
	{
		
		Gson gson=new Gson();
		String string=gson.toJson(addmodel);
	       
        FileWriter filewriter;
		try {
			filewriter = new FileWriter("/home/admin1/Desktop/userdetails.json");
			filewriter.write(string);
		       filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
       
	}
}
