package com.bridgelabz.designpattern.facade.implementation;

import com.bridgelabz.designpattern.facade.myinterface.MobileShop;

public class Samsung implements MobileShop
{

	@Override
	public void modelno() {
	System.out.println("Note 7");
	}

	@Override
	public void price() {
		System.out.println("54000");
	}

}
