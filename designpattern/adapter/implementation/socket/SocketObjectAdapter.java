package com.bridgelabz.designpattern.adapter.implementation.socket;

import com.bridgelabz.designpattern.adapter.beans.Volts;
import com.bridgelabz.designpattern.adapter.myinterface.SocketAdapter;

public class SocketObjectAdapter implements SocketAdapter 
{
Socket socket=new Socket();
	@Override
	public Volts get240volt() 
	{
		
		return socket.getVolts();
	}

	@Override
	public Volts get12volt()
	{
		Volts v=socket.getVolts();
		return convertvolt(v, 20);
	}

	@Override
	public Volts get3volt() {
		Volts v=socket.getVolts();
		return convertvolt(v, 80);
	}
    
	public Volts convertvolt(Volts v, int i)
	{
		return new Volts(v.getVolt()/i);
	}
	
}
