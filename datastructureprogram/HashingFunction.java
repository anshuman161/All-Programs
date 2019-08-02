package com.bridgelabz.datastructureprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Queue;

public class HashingFunction 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		
		int[] array = new int[11];
		int data = 0;
		String demo = "";
		File f = new File("/home/admin1/Desktop/tennumbers.txt");
		Scanner sc = new Scanner(f);

		while (sc.hasNextLine()) {
			demo = sc.nextLine();
		}
		String[] arr = demo.split(" ");
		int[] data1 = new int[arr.length];
		LinkedList lsl = new LinkedList();
		

		for (int i = 0; i < arr.length; i++)
		{
			int num = Integer.parseInt(arr[i]);
			data1[i] = num;

		}
             
		int value1[][] = new int[data1.length][data1.length];
		int count = 0;
		for (int i = 0; i < data1.length; i++) 
		{
			for (int k = 0; k < data1.length; k++) 
			{
				if (data1[k] % 11 == count) 
				{

					value1[i][k] = data1[k];

				}

			}
			count++;
		}

		for (int i = 0; i < data1.length; i++)
		{
			for (int j = 0; j < data1.length; j++)
			{
				lsl.insert(value1[i][j]+"    ");
			}
			lsl.insert("\n");
		}
         lsl.show();

	}
}
