package com.bridgelabz.designpattern.adapter.implementation;

import com.bridgelabz.designpattern.adapter.myinterface.Pen;

public class School {
public static void main(String[] args) {
	Assignment on=new Assignment();
	Pen p=new Adepter();
	on.setP(p);
	on.writeassignment("tired to write assignment");
}
}
