package com.bridgelabz.functionalprograme;


import java.util.Random;

public class Coupon {

	public static void getRandom(int[] array) 
	{
		int size = array.length;
		int position = new Random().nextInt(size);
		
		System.out.println("Random number is = " + array[position]);
		
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 56, 69, 78, 41, 56, 87 };

		getRandom(array);
	}

}