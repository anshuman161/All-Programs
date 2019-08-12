package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.MyUtil;

public class VendingMachine {
	public static void notcount() {
		
		int[] notes = new int[] { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int noteCounter;
		int amount = MyUtil.scannerforinteger();

		for (int i = notes.length-1; i >= 0; i--) 
		{
			if (amount >= notes[i]) {
				noteCounter = amount / notes[i];
				amount = amount % notes[i];
				System.out.println("Note of Rs." + notes[i] + " : " + "Number of minimum Note needed= " + noteCounter);
			}
		}

		

	}

	public static void main(String[] args) {
		notcount();

	}
}