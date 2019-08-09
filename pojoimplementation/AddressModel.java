package com.bridgelabz.pojoimplementation;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONAware;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class AddressModel implements JSONStreamAware
{
 private int id;
 private String firstname;
 private String lastname;
 private long mobileno;
 private String city;
 private int zip;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "AddressPojo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobileno=" + mobileno
			+ ", city=" + city + ", zip=" + zip + "]";
}
 public AddressModel() {
	// TODO Auto-generated constructor stub
}
public AddressModel(int id, String firstname, String lastname, long mobileno, String city, int zip) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.mobileno = mobileno;
	this.city = city;
	this.zip = zip;
}
@Override
public void writeJSONString(Writer out) throws IOException {
LinkedHashMap map=new LinkedHashMap();
	map.put("id", String.valueOf(id));
	map.put("firstname", "firstname");
	map.put("lastname", "lastname");
	map.put("mobileno", "mobileno");
	map.put("city", "city");
	map.put("zip", String.valueOf(zip));
	JSONValue.writeJSONString(map, out);
}

 
}
