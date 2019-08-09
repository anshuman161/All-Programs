package com.bridgelabz.oopsprogramestockreport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.pojoimplementation.CompanyDetails;

public class UserBusiness 
{
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objMapper = new ObjectMapper();
		File f = new File("/home/admin1/Desktop/userdetails.json");
		InputStream inptStream = new FileInputStream(f);
		TypeReference<List<CompanyDetails>> typeReference = new TypeReference<List<CompanyDetails>>() {
		};
		List<CompanyDetails> modles = objMapper.readValue(inptStream, typeReference);
		Scanner sc=new Scanner(System.in);

 		System.out.println("Enter your name");
        String username=sc.nextLine();
        
 		System.out.println("Enter Share Name to buy");
        String sharename=sc.nextLine(); 		
 		System.out.println("Enter number of share....");
 		int noofshare=sc.nextInt();
 		CompanyDetails companyDetails2 = null ;
 		for (CompanyDetails companyDetails : modles) {
			if(companyDetails.getUsername().equals(username))
			{
				Business business = new Business();
				companyDetails2 = business.getStockdetails(companyDetails, sharename, noofshare);
				System.out.println(companyDetails2.getUsername()+" "+companyDetails2.getAmount()+" "+companyDetails2.getStockList());
				
			}
		}
 		List<CompanyDetails> list=new ArrayList<CompanyDetails>();
 		list.add(companyDetails2);
 		objMapper.writeValue(f,list);
	}
}
