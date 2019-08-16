package com.bridgelabz.designpattern.factorydesign.beans;

public class PC implements Computer1 {
private String RAM;
private String HDD;
private String CPU;

	public PC(String rAM, String hDD, String cPU)
	{
	super();
	RAM = rAM;
	HDD = hDD;
	CPU = cPU;
}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}

}
