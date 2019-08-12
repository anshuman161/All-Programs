package com.bridgelabz.oops.transactions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.commercialdataprocessing.pojo.Stock;
import com.bridgelabz.utility.LinkedList;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyShare 
{  
  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
  {
	  
	 ObjectMapper objMapper = new ObjectMapper();
     File file = new File("/home/admin1/Desktop/stockforsell.json");
	 
	TypeReference<ArrayList<Stock>> typeReference = new TypeReference<ArrayList<Stock>>() {
	};
	ArrayList<Stock> companyList = objMapper.readValue(file, typeReference);
	        
	  Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();            //from utile pkg
   	  Stock account=new Stock();   
      System.out.println("Enter 1 for insert   ");
      System.out.println("Enter 2 for remove  ");
      int button=sc.nextInt();
      switch (button) 
      {
	case 1:
		for (Stock cmpny : companyList) {
			System.out.println("Enter share name");
			String sharename=sc.next();
			cmpny.setSharename(sharename);
			System.out.println("Enter share no ");
			int noofshare=sc.nextInt();
			cmpny.setNoofshare(noofshare);
			System.out.println("Enter share price ");
			int shareprice=sc.nextInt();	
			cmpny.setShareprice(shareprice);
            
            
			list.insert(cmpny);         //own method for inserting any element
			
			list.show();                   //for displaying
 			objMapper.writeValue(file, companyList);  //writing into json file
			break;
              			
		}
			break;
	    
case 2:
	for (Stock cmpny : companyList) 
	{
		System.out.println("Enter share name to remove");
		String sname=sc.next();
		for (int i = 0; i <companyList.size(); i++) 
		{
		  if (cmpny.getSharename().equals(sname))
		  {
			  cmpny.getSharename();
			  cmpny.getNoofshare();
			  cmpny.getShareprice();
			  companyList.add(cmpny);
			  System.out.println("1111111");
			  System.out.println();
            //  list.removeatindex(companyList);
              System.out.println("22222");  
              list.show();
              objMapper.writeValue(file, list);
              break;
		  }       
		}
	}		
    break;
			
	default:
		break;
  	 }
       
  } 
}
