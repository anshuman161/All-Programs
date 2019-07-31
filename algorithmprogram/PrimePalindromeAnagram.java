package com.bridgelabz.algorithmprogram;

public class PrimePalindromeAnagram {
	public static void prim(int digit) {

		int i = 0, value = 0;
		
		int primeNumbers = 0;

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
				primeNumbers = i;
				MyUtil.palindrome(primeNumbers);
			}
			
		}
		System.out.println("These are the numbers that are Prime as well as palindrom from 1 to 1000 are :");
	

	}

	public static void main(String[] args) {
		int digit = 1000;
		prim(digit);
	}
}