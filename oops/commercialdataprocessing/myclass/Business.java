package com.bridgelabz.oops.commercialdataprocessing.myclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.commercialdataprocessing.pojo.CompanyDetails;
import com.bridgelabz.oops.commercialdataprocessing.pojo.Stock;
import com.google.gson.Gson;

public class Business
{
	 Gson gson=new Gson();
		List<Stock> liststock=new ArrayList<Stock>();
		
	public Business() throws FileNotFoundException, IOException, ParseException
	  {
	
		  JSONParser parser=new JSONParser();
		  JSONArray jarr = (JSONArray) parser
					.parse(new FileReader("/home/admin1/Desktop/stockdetails.json"));
		  for (Object obj1 : jarr)
		  {
			  
			  JSONObject obj2 = (JSONObject) obj1;
			  Stock stock=new Stock();
			  stock.setSharename((String)(obj2.get("sharename")));
			  stock.setNoofshare((int) (obj2.get("noofshare")));
	 		  stock.setShareprice((int) (obj2.get("shareprice")));
	 		  liststock.add(stock);		  
		  }
	  }
//getstockdetails method calling from userbusiness 
	public CompanyDetails getStockdetails(CompanyDetails companyDetails, String ShareName, int NoOfShare)
			throws JsonParseException, JsonMappingException, IOException {
		/*
		 * ObjectMapper objMapper = new ObjectMapper(); File f = new
		 * File("/home/admin1/Desktop/stockdetails.json"); InputStream inptStream = new
		 * FileInputStream(f); TypeReference<ArrayList<Stock>> typeReference = new
		 * TypeReference<ArrayList<Stock>>() { };
		 */
		
		List<Stock> slist = companyDetails.getStockList();
		//ArrayList<Stock> stockList = objMapper.readValue(inptStream, typeReference);
		for (Stock stock2 : liststock) 
		{
			if (stock2.getSharename().equals(ShareName)) 
			{
				stock2.setSharename(ShareName);
				stock2.setNoofshare(NoOfShare);
				int sharetotalAmount=NoOfShare*stock2.getShareprice();
				stock2.setShareprice(sharetotalAmount);
				slist.add(stock2);
				companyDetails.setStockList(slist);
				companyDetails.setAmount(companyDetails.getAmount()-sharetotalAmount);
			}
		}
		return companyDetails;
	}
	
	
	/////////////-----------------------sell
	
	
	
	public CompanyDetails getStockdetailsforsell(CompanyDetails companyDetails, String sharenametosell, int NoOfShare)
			throws JsonParseException, JsonMappingException, IOException {
		/*
		 * ObjectMapper objMapper = new ObjectMapper(); File f = new
		 * File("/home/admin1/Desktop/stockforsell.json"); InputStream inptStream = new
		 * FileInputStream(f); TypeReference<ArrayList<Stock>> typeReference = new
		 * TypeReference<ArrayList<Stock>>() { };
		 */
		List<Stock> slist = companyDetails.getStockList();
	//	ArrayList<Stock> stockList = objMapper.readValue(inptStream, typeReference);
	   // System.out.println(stockList);
		
		for (Stock stock2 : liststock) 
		{
			if (stock2.getSharename().equals(sharenametosell)) 
			{
				stock2.setNoofshare(stock2.getNoofshare()-NoOfShare);
				int sharetotalAmount=NoOfShare*stock2.getShareprice();
				System.out.println(sharetotalAmount);
				      
				int store=stock2.getShareprice()-sharetotalAmount;
				System.out.println("store price "+store);
				stock2.setShareprice(stock2.getShareprice()+sharetotalAmount);
				slist.add(stock2);
				companyDetails.setStockList(slist);
				companyDetails.setAmount(companyDetails.getAmount()+store);
				System.out.println("companyyyyyyyyyyyy"+companyDetails);
			}
		}
		return companyDetails;

	}
	
}