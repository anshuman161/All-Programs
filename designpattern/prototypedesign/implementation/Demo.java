package com.bridgelabz.designpattern.prototypedesign.implementation;

public class Demo {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bk=new BookShop();
	bk.setShopname("novalty");
	bk.load();
	
	BookShop bk1= bk.clone();
	bk.getBooks().remove(2);
	bk1.setShopname("A1");
	bk1.load();
	System.out.println(bk);
	System.out.println(bk1);
	
	
}
}
