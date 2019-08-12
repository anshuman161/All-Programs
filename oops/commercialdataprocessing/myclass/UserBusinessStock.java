package com.bridgelabz.oops.commercialdataprocessing.myclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.commercialdataprocessing.myinterface.DataTransaction;
import com.bridgelabz.oops.commercialdataprocessing.pojo.CompanyDetails;

public class UserBusinessStock implements DataTransaction
{
	ObjectMapper objMapper = new ObjectMapper();
	File file = new File("/home/admin1/Desktop/userdetails.json");
	
	TypeReference<List<CompanyDetails>> typeReference = new TypeReference<List<CompanyDetails>>() {
	};
	List<CompanyDetails> modles; 
	Scanner sc=new Scanner(System.in);
	
	
	public void forbuy()
	{
		try {
			modles= objMapper.readValue(file, typeReference);
		
		//Scanner sc=new Scanner(System.in);

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
 		objMapper.writeValue(file,list);
 		
	}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void forsell()
	{
	  try {
		  modles= objMapper.readValue(file, typeReference);
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
			List<CompanyDetails> listtosell = new ArrayList<CompanyDetails>();
			listtosell.add(companyDetails3);
			objMapper.writeValue(file, listtosell);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
    }
