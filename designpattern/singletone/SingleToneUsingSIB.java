package com.bridgelabz.designpattern.singletone;
//singleton using static initialization block
public class SingleToneUsingSIB 
{
private static SingleToneUsingSIB sib;
private SingleToneUsingSIB()
 {
   	
 }
static
{
 sib=new SingleToneUsingSIB();	
}
public static void main(String[] args) {
	SingleToneUsingSIB s=new SingleToneUsingSIB();
 System.out.println(s.sib);
 SingleToneUsingSIB s1=new SingleToneUsingSIB();
 System.out.println(s1.sib);
}
}
