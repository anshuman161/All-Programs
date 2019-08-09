package com.bridgelabz.pojoimplementation;

public class Stock
{
private String sharename;	
private int noofshare;
private int shareprice;

public String getSharename() {
	return sharename;
}
public void setSharename(String sharename) {
	this.sharename = sharename;
}
public int getNoofshare() {
	return noofshare;
}
public void setNoofshare(int noofshare) {
	this.noofshare = noofshare;
}
public int getShareprice() {
	return shareprice;
}
public void setShareprice(int shareprice) {
	this.shareprice = shareprice;
}

Stock(){}
public Stock(String sharename, int noofshare, int shareprice) {
	super();
	this.sharename = sharename;
	this.noofshare = noofshare;
	this.shareprice = shareprice;
}
@Override
public String toString() {
	return "Stock [sharename=" + sharename + ", noofshare=" + noofshare + ", shareprice=" + shareprice + "]";
}


}
