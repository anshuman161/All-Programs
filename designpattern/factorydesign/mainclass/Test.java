package com.bridgelabz.designpattern.factorydesign.mainclass;

import com.bridgelabz.designpattern.factorydesign.beans.Computer1;

public class Test {
	public static void main(String[] args) {
		Computer1 comp = ComputerFactory.createfactory(ComputerType.PC, "2 GB", "500 GB", "intel");
		Computer1 comp1 = ComputerFactory.createfactory(ComputerType.Server, "4 GB", "600", "dell");
		System.out.println(comp.getRAM() + " " + comp.getHDD() + " " + comp.getCPU());
		System.out.println(comp1.getRAM() + " " + comp1.getHDD() + " " + comp1.getCPU());
	}
}
