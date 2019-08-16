package com.bridgelabz.designpattern.adapter.implementation;

import com.bridgelabz.designpattern.adapter.myinterface.Pen;

public class Assignment
{
	private Pen p;
	
public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

public void writeassignment(String str)
{
	p.write(str);
}
}
