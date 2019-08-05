package com.bridgelabz.oopsprograme;

import com.bridgelabz.oopsprogrameJsonUtil.MyJsonUtil;

@SuppressWarnings("unused")
public class Test 
{
	public static void main(String[] args) {
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
