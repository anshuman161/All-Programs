package com.bridgelabz.designpattern.adapter.implementation;

import com.bridgelabz.designpattern.adapter.myinterface.Pen;

public class Adepter implements Pen 
{
 PilotPen pp=new PilotPen();
	@Override
	public void write(String str) 
	{
       		pp.mark(str);
	}
		

}
