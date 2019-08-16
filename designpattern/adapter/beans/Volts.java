package com.bridgelabz.designpattern.adapter.beans;

public class Volts 
{
  private int volt;

public Volts(int volt) {
	this.volt=volt;
}

public int getVolt() {
	return volt;
}

public void setVolt(int volt) {
	this.volt = volt;
}

@Override
public String toString() {
	return "Volts [volt=" + volt + "]";
}
  
}
