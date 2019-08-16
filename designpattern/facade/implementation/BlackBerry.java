package com.bridgelabz.designpattern.facade.implementation;

import com.bridgelabz.designpattern.facade.myinterface.MobileShop;

public class BlackBerry implements MobileShop
{

	@Override
	public void modelno() {
		System.out.println("x-550");
	}

	@Override
	public void price() {
		System.out.println("60000");
	}

}
