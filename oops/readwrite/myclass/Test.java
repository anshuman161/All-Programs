package com.bridgelabz.oops.readwrite.myclass;

import com.bridgelabz.utility.MyJsonUtil;

@SuppressWarnings("unused")
public class Test 
{
	public void testmethod()
	{
		Emp emp=new Emp();
		emp.setEmpno(101);
		emp.setName("rama");
	    System.out.println("==============java to json====");
		String jsonemp=MyJsonUtil.javatojson(emp);
		    System.out.println(jsonemp);
		    System.out.println("==============json to java====");
		    Emp emp1=MyJsonUtil.jsontojava(jsonemp, Emp.class);
		    System.out.println(emp1.getEmpno()+"   "+emp1.getName());	
	}
	
}
