package com.bridgelabz.designpattern.adapter.implementation.socket;

import com.bridgelabz.designpattern.adapter.beans.Volts;
import com.bridgelabz.designpattern.adapter.myinterface.SocketAdapter;

public class AdapterClassPattern 
{
  SocketAdapter socketadapter=new SocketObjectAdapter();
  public void testobjectadapter()
  {
	    Volts v3 = getVolt(socketadapter,3);
		Volts v12 = getVolt(socketadapter,12);
		Volts v240 = getVolt(socketadapter,240);
		System.out.println("v3 volts using Object Adapter="+v3.getVolt());
		System.out.println("v12 volts using Object Adapter="+v12.getVolt());
		System.out.println("v240 volts using Object Adapter="+v240.getVolt());        
  }	
	
	
  public void testsocketadapter()
  {
	  Volts v3 = getVolt(socketadapter,3);
		Volts v12 = getVolt(socketadapter,12);
		Volts v240 = getVolt(socketadapter,240);
		System.out.println("v3 volts using Object Adapter="+v3.getVolt());
		System.out.println("v12 volts using Object Adapter="+v12.getVolt());
		System.out.println("v240 volts using Object Adapter="+v240.getVolt());            	   
  }
  private static Volts getVolt(SocketAdapter socketadapter2, int i) 
  {
		switch (i) 
		{
		case 3:
			return socketadapter2.get3volt();
		case 12:
			return socketadapter2.get12volt();
		case 240:
			return socketadapter2.get240volt();
		default:
			return socketadapter2.get240volt();
		}
  }
  

}
