package com.bridgelabz.algorithmprogram;

public class PrimeCheck {

	public static void prim(int digit) {

		int i = 0, value = 0;

		String primeNumbers = "";

		for (i = 1; i <= digit; i++)
		{
			int counter = 0;
			for (value = i; value >= 1; value--) 
			{
				if (i % value == 0)
		   {
					counter = counter + 1;
			}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
				
			}
		}
		System.out.println("Prime numbers from 1 to 1000 are :");
		System.out.println(primeNumbers);

	}

	public static void main(String[] args) {
		int digit = 1000;
		prim(digit);
	}
}