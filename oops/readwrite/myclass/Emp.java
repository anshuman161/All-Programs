package com.bridgelabz.oops.readwrite.myclass;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;
@SuppressWarnings("serial")
@JsonPropertyOrder(value=
{ "name","empno" }
)  //------------for getting in line by this order
public class Emp implements Serializable 
{
//	@JsonIgnore    for ignoring this property from both
  int empno;
	
  String name;
 
public int getEmpno() {
	return empno;
}
  
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
} 
//@JsonSetter()  ///-if name is same to other property like id so it will help
public void setName(String name) {
	this.name = name;
}
  
}
