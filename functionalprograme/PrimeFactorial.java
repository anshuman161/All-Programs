package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class PrimeFactorial {
	static void primefactor(int n) {

		for (int i = 2; i < n; i++) {

			while (n % i == 0) 
			{
				System.out.println(i + " ");
				n = n / i;
			}

			if (n > 2) {
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		primefactor(n);
	}
}