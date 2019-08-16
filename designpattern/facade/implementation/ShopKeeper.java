package com.bridgelabz.designpattern.facade.implementation;

public class ShopKeeper
{
 private Iphone iphone;
 private Samsung samsung;
 private BlackBerry black;
 
 
 public ShopKeeper() 
 {
   iphone=new Iphone();
   samsung=new Samsung();
   black=new BlackBerry();
 }
 public void iphonesell()
 {
    iphone.modelno();
    iphone.price();
 }		   
 public void samsungsell()
 {
   samsung.modelno();
   samsung.price();
 }
 public void blacksell()
 {
   black.modelno();
   black.price();
}
}
