package com.bridgelabz.designpattern.prototypedesign.implementation;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
private String shopname;
List<Book> books=new ArrayList<Book>();
public String getShopname() {
	return shopname;
}
public void setShopname(String shopname) {
	this.shopname = shopname;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
public void load()
{
  for (int i = 0; i <= 5; i++) 
  {
	Book b=new Book();
	b.setId(i);
	b.setBname("book name "+i);
	getBooks().add(b);
  }	
}

@Override
public String toString() {
	return "BookShop [shopname=" + shopname + ", books=" + books + "]";
}
@Override
protected BookShop clone() throws CloneNotSupportedException {
	BookShop bs=new BookShop();
		/*
		 * for (Book book : this.getBooks()) { bs.getBooks().add(book); }
		 */
	return bs;
}

}
