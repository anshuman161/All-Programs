package com.bridgelabz.designpattern.proxy.implementation;

import java.io.IOException;

import com.bridgelabz.designpattern.proxy.myinterface.CommandExecuter;

public class ExecuterCommandImpl implements CommandExecuter
{

	@Override
	public void runcommand(String cmd) 
	{
		try {
			Runtime.getRuntime().exec(cmd);
			System.out.println(cmd);
     		} 
		    catch (IOException e) 
		    {	
			e.printStackTrace();
		    }
		
	}
  
}
