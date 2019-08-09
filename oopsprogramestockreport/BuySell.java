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

public class BuySell 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		/*
		 * ObjectMapper objMapper = new ObjectMapper(); File f = new
		 * File("/home/admin1/Desktop/SwitchBuySell.json"); InputStream inptStream = new
		 * FileInputStream(f); TypeReference<List<CompanyDetails>> typeReference = new
		 * TypeReference<List<CompanyDetails>>() { }; List<CompanyDetails> modles =
		 * objMapper.readValue(inptStream, typeReference); Scanner sc=new
		 * Scanner(System.in);
		 * 
		 * System.out.println("Enter your name"); String username=sc.nextLine();
		 * 
		 * System.out.println("What do you want to do...");
		 * 
		 * String request=sc.nextLine();
		 * 
		 * 
		 * switch (request) { case "buy": System.out.println("Enter Share Name to buy");
		 * String sharename=sc.nextLine();
		 * System.out.println("Enter number of share...."); int noofshare=sc.nextInt();
		 * CompanyDetails companyDetails2 = null ; for (CompanyDetails companyDetails :
		 * modles) { if(companyDetails.getUsername().equals(username)) { Business
		 * business = new Business(); companyDetails2 =
		 * business.getStockdetails(companyDetails, sharename, noofshare);
		 * System.out.println(companyDetails2.getUsername()+" "+companyDetails2.
		 * getAmount()+" "+companyDetails2.getStockList());
		 * 
		 * } } List<CompanyDetails> list=new ArrayList<CompanyDetails>();
		 * list.add(companyDetails2); objMapper.writeValue(f,list); break;
		 * 
		 * case "sell": System.out.println("Enter Share Name to sell"); String
		 * sharenametosell=sc.nextLine();
		 * System.out.println("Enter number of share...."); int
		 * noofsharetosell=sc.nextInt();
		 * 
		 * 
		 * CompanyDetails companyDetails3 = null ; for (CompanyDetails companyDetails :
		 * modles) { if(companyDetails.getUsername().equals(username)) { Business
		 * business = new Business(); companyDetails3 =
		 * business.getStockdetailsforsell(companyDetails, sharenametosell,
		 * noofsharetosell);
		 * System.out.println(companyDetails3.getUsername()+" "+companyDetails3.
		 * getAmount()+" "+companyDetails3.getStockList()); } } List<CompanyDetails>
		 * listtosell=new ArrayList<CompanyDetails>(); listtosell.add(companyDetails3);
		 * objMapper.writeValue(f,listtosell);
		 * 
		 * 
		 * break;
		 * 
		 * default: break; }
		 */
        
	}
}
