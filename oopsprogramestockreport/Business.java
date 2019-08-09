package com.bridgelabz.oopsprogramestockreport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.pojoimplementation.CompanyDetails;
import com.bridgelabz.pojoimplementation.Stock;

public class Business
{

	public CompanyDetails getStockdetails(CompanyDetails companyDetails, String ShareName, int NoOfShare)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objMapper = new ObjectMapper();
		File f = new File("/home/admin1/Desktop/stockdetails.json");
		InputStream inptStream = new FileInputStream(f);
		TypeReference<ArrayList<Stock>> typeReference = new TypeReference<ArrayList<Stock>>() {
		};
		List<Stock> slist = companyDetails.getStockList();
		ArrayList<Stock> stockList = objMapper.readValue(inptStream, typeReference);
	
		
		for (Stock stock2 : stockList) 
		{
			if (stock2.getSharename().equals(ShareName)) 
			{
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
	
	
	
	/*
	 * public CompanyDetails getStockdetailsforsell(CompanyDetails companyDetails,
	 * String sharenametosell, int NoOfShare) throws JsonParseException,
	 * JsonMappingException, IOException {
	 * 
	 * ObjectMapper objMapper = new ObjectMapper(); File f = new
	 * File("/home/admin1/Desktop/stockforsell.json"); InputStream inptStream = new
	 * FileInputStream(f); TypeReference<ArrayList<CompanyDetails>> typeReference =
	 * new TypeReference<ArrayList<CompanyDetails>>() { };
	 * 
	 * List<Stock> slist = companyDetails.getStockList(); ArrayList<Stock> stockList
	 * = objMapper.readValue(inptStream, typeReference);
	 * 
	 * for (Stock stock2 : slist) { if
	 * (stock2.getSharename().equals(sharenametosell)) {
	 * stock2.setNoofshare(NoOfShare); int
	 * sharetotalAmount=NoOfShare*stock2.getShareprice();
	 * stock2.setShareprice(stock2.getShareprice()-sharetotalAmount);
	 * slist.add(stock2); companyDetails.setStockList(slist);
	 * companyDetails.setAmount(companyDetails.getAmount()+sharetotalAmount); } }
	 * return companyDetails;
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
}