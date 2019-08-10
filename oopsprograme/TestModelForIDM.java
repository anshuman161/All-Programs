package com.bridgelabz.oopsprograme;

//import org.codehaus.jackson.annotate.JsonPropertyOrder;
//
//@JsonPropertyOrder(value= {"name","weight","price"})
public class TestModelForIDM 
{
 private String name;
 private float weight;
 private int price;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "ModelForIDM [name=" + name + ", weight=" + weight + ", price=" + price + "]";
}

 
}
