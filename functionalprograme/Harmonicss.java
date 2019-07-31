package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class Harmonicss {

	static void Harm(int N) {

		float harmonic = 1;

		for (int i = 2; i <= N; i++) 
		{
			harmonic += (float) 1 / i;
		}

		
		System.out.println(harmonic);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
        Harm(N);
	}
}