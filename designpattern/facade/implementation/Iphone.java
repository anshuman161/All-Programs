package com.bridgelabz.designpattern.facade.implementation;

import com.bridgelabz.designpattern.facade.myinterface.MobileShop;

public class Iphone implements MobileShop
{

	@Override
	public void modelno() {
		System.out.println("iphone-x");
		
	}

	@Override
	public void price() {
		System.out.println("100000");
	}

}
