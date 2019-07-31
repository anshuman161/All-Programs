package com.bridgelabz.algorithmprogram;

import java.io.IOException;
import java.util.Scanner;

public class InputIntArray {
	public static int[] scannercall() throws IOException {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];

		System.out.println("elements are:");

		for (int i = 0; i < n; i++)

		{

			a[i] = s.nextInt();
       
		}
		
		System.out.println("---------------------------------");

		for (int i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
		return a;
		          
            
		
	}

	public static void main(String[] args) throws IOException {
		scannercall();
	}
}
