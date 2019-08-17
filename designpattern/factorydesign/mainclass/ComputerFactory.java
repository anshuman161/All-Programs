package com.bridgelabz.designpattern.factorydesign.mainclass;

import com.bridgelabz.designpattern.factorydesign.beans.Computer1;
import com.bridgelabz.designpattern.factorydesign.beans.PC;
import com.bridgelabz.designpattern.factorydesign.beans.Server;

public class ComputerFactory 
{
 public static Computer1 createfactory(ComputerType type,String ram,String hdd,String pc)
 {
       Computer1 comp=null;
       switch (type)
       {
	    case PC:
		comp=new PC(ram, hdd, pc);
		break;
	    case Server:
		comp=new Server(ram, hdd, pc);
		break;

	    default:
		break;
	 }
	return comp;
       
 }
}
