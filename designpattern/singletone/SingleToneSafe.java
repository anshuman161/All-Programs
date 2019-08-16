package com.bridgelabz.designpattern.singletone;
//for thread safe condition
public class SingleToneSafe
{
 private static SingleToneSafe single;
 private SingleToneSafe() {}
 synchronized public static SingleToneSafe getSingleToneSafe()
 {
       	if (single==null)
       	{
		 single=new SingleToneSafe();	
		}
       	return single;
 }
}
