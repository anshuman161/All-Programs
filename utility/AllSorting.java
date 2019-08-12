package com.bridgelabz.utility;

public class AllSorting {

	public static void bubbleforinteger() {
		double start = System.currentTimeMillis();
		int[] number = MyUtil.scannerarrayint();
		int temp = 0;
		for (int i = 0; i < number.length; i++) 
		{
			int flag = 0;
			for (int j = 0; j < number.length - 1 - i; j++) 
			{
				if (number[j] > number[j + 1]) 
				{
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < number.length; i++) 
		{
			System.out.println(number[i] + " ");
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed time " + btwn);
	}

	/////////////////////// -------------------------
	public static void bubbleforstring() {
		double start = System.currentTimeMillis();
		String[] value = MyUtil.scannerarraystring();
		String temp = "";
		for (int i = 0; i < value.length; i++) {
			int flag = 0;
			for (int j = 0; j < value.length - 1; j++) {
				if (value[j + 1].compareTo(value[j]) < 0) {
					temp = value[j];
					value[j] = value[j + 1];
					value[j + 1] = temp;
					flag = 1;
				}

			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i] + " ");
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed time is " + btwn);
	}

	///////////// -----------------------------------------------------------
	public static void insertioninteger() {
		double start = System.currentTimeMillis();
		int[] number = MyUtil.scannerarrayint();

		int temp, j;
		for (int i = 1; i < number.length; i++) {
			temp = number[i];
			j = i;
			while (j > 0 && number[j - 1] > temp) {
				number[j] = number[j - 1];
				j = j - 1;
			}
			number[j] = temp;

		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed time is " + btwn);
	}

/////////////////////////--------------------------------
	public static void insertionstring() {
		double start = System.currentTimeMillis();
		String[] value = MyUtil.scannerarraystring();
		String demo = "";
		int temp, j;
		for (int i = 1; i < value.length; i++) {
			demo = value[i];
			j = i;
			while (j > 0 && demo.compareTo(value[j - 1]) < 0) {
				value[j] = value[j - 1];
				j = j - 1;

			}
			value[j] = demo;
		}
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed time is " + btwn);
	
	}

	/////////////////////// ------------------------------------------
	public static void binarystring() {
		double start = System.currentTimeMillis();
		String[] value = MyUtil.scannerarraystring();
		String check = MyUtil.getstring();
		int highindex = value.length - 1;
		int lowindex = 0;
		int midindex = (highindex + lowindex) / 2;
		while (lowindex < highindex) {

			if (check.equals(value[midindex])) {
				System.out.println("This is correct index " + midindex + " for value of check " + check);
				break;
			}

			else if (value[midindex].compareTo(check) < 0) {
				lowindex = midindex + 1;
			} else {
				highindex = midindex - 1;
			}
			midindex = (highindex + lowindex) / 2;
		}
		if (lowindex > highindex) {
			System.out.println("Not valid");
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed time is " + btwn);
	}
	///////////////////////////// ---------------

	public static int binaryinteger() {
		double start = System.currentTimeMillis();

		int[] number = MyUtil.scannerarrayint();

		int check = MyUtil.scannerforinteger();
		int highindex = number.length - 1;
		int lowindex = 0;
		int midindex = (highindex + lowindex) / 2;
		while (lowindex < highindex) {

			if (check == number[midindex]) 
			{
				System.out.println("This is correct index " + midindex + " for value of check " + check);
				break;

			} else if (number[midindex] < check) {
				lowindex = midindex + 1;
			} else {
				highindex = midindex - 1;
			}
			midindex = (highindex + lowindex) / 2;
		}
		if (lowindex > highindex) {
			System.out.println("Not valid");
		}
		double end = System.currentTimeMillis();
		double btwn = end - start;
		System.out.println("Elapsed Time is " + btwn);
		return midindex;
	}

	//////////////////////////// ----------------

	public static void main(String[] args) {

		//bubbleforinteger();
		//bubbleforstring();
		//insertioninteger();
		//insertionstring();
		//binaryinteger();
		//binarystring();

	}
}