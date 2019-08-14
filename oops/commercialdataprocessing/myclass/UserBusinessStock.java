package com.bridgelabz.oops.commercialdataprocessing.myclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.commercialdataprocessing.myinterface.DataTransaction;
import com.bridgelabz.oops.commercialdataprocessing.mymain.WriteToJsonFile;
import com.bridgelabz.oops.commercialdataprocessing.pojo.CompanyDetails;
import com.bridgelabz.oops.commercialdataprocessing.pojo.Stock;

public class UserBusinessStock implements DataTransaction
{
	/*
	 * ObjectMapper objMapper = new ObjectMapper(); File file = new
	 * File("/home/admin1/Desktop/userdetails.json");
	 * 
	 * TypeReference<List<CompanyDetails>> typeReference = new
	 * TypeReference<List<CompanyDetails>>() { };
	 */
	List<CompanyDetails> modles=new ArrayList<CompanyDetails>();
	public UserBusinessStock() throws FileNotFoundException, IOException, ParseException
	  {
	
		  JSONParser parser=new JSONParser();
		  JSONArray jarr = (JSONArray) parser.parse(new FileReader("/home/admin1/Desktop/userdetails.json"));
		  for (Object obj1 : jarr)
		  {
			   JSONObject obj2 = (JSONObject) obj1;
			   CompanyDetails cdata=new CompanyDetails();
			   cdata.setUsername((String) obj2.get("username"));
			   System.out.println("user.....");
			   cdata.setAmount((int)(long) obj2.get("amount"));
			   System.out.println("amount......");
			   cdata.setStockList((List<Stock>) obj2.get("stockList"));
	 		   modles.add(cdata);		  
		  }
	  }
	
	
	
	Scanner sc=new Scanner(System.in);
	WriteToJsonFile writejson=new WriteToJsonFile();
	
	public void forbuy()
	{
	
			//modles= objMapper.readValue(file, typeReference);
		
		//Scanner sc=new Scanner(System.in);

 		System.out.println("Enter your name");
        String username=sc.nextLine();
        
 		System.out.println("Enter Share Name to buy");
        String sharename=sc.nextLine(); 		
 		System.out.println("Enter number of share....");
 		int noofshare=sc.nextInt();
 		CompanyDetails companyDetails2 = new CompanyDetails() ;
 		for (CompanyDetails companyDetails : modles) {
			if(companyDetails.getUsername().equals(username))
			{
				System.out.println("nnnnnnnnn");
				try {
				Business business = new Business();
				System.out.println("bbbbbbbb");
				companyDetails2 = business.getStockdetails(companyDetails, sharename, noofshare);
				System.out.println(companyDetails2.getUsername()+" "+companyDetails2.getAmount()+" "+companyDetails2.getStockList());
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
 		
 		modles.add(companyDetails2);
 		
 		writejson.writetojson(modles);
 		//objMapper.writeValue(file,list);
 		
	}
	
	
	public void forsell()
	{
	  try {
		 // modles= objMapper.readValue(file, typeReference);
		  System.out.println("Enter your name");
	        String username=sc.nextLine(); 
		  
		  System.out.println("Enter Share Name to sell");
			String sharenametosell = sc.nextLine();
			System.out.println("Enter number of share....");
			int noofsharetosell = sc.nextInt();
			
			System.out.println(modles);
       
			CompanyDetails companyDetails3 = null;
		
			for (CompanyDetails companyDetails : modles) 
			{
				System.out.println("2222222222");
				if (companyDetails.getUsername().equals(username)) 
				{
				 System.out.println("11111111111");
				 Business business = new Business();
				companyDetails3 = business.getStockdetailsforsell(companyDetails, sharenametosell, noofsharetosell);
	        	System.out.println(companyDetails3.getUsername() + " " + companyDetails3.getAmount() + " "
			   + companyDetails3.getStockList());
				}
         
			}
			List<CompanyDetails> modles = new ArrayList<CompanyDetails>();
			modles.add(companyDetails3);
			writejson.writetojson(modles);
		//	objMapper.writeValue(file, listtosell);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
    }
