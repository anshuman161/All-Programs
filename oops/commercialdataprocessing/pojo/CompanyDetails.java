package com.bridgelabz.oops.commercialdataprocessing.pojo;

import java.util.List;

public class CompanyDetails 
{
	private String username;
	private int amount;
	private List<Stock> stockList;

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}

	@Override
	public String toString() {
		return "CompanyDetails [username=" + username + ", amount=" + amount + ", stock=" + stockList + "]";
	}
	
}
