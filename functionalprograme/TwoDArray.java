package com.bridgelabz.functionalprograme;


import java.util.Scanner;

public class TwoDArray {

	public static void twod()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter your row length : ");
		int rows = s.nextInt();
		System.out.print("enter your coloumn length : ");
		int cols = s.nextInt();
		int[][] matr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) 
			{
				matr[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matr[i][j] + "    ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		twod();
	}
}