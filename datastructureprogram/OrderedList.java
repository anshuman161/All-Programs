package com.bridgelabz.datastructureprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

import com.bridgelabz.utility.LinkedList2;

public class OrderedList {
	public static void main(String[] args) throws FileNotFoundException {
		String demo = "";
		File f = new File("/home/admin1/Desktop/fororderlist.txt");
		Scanner sc = new Scanner(f);

		while (sc.hasNextLine()) 
		{
			demo = sc.nextLine();
		}

		String[] arr = demo.split(" ");
                    
		int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        
		LinkedList2 ls = new LinkedList2();

		System.out.println("Getting values from file --------");
		for (int i : array) 
		{
              
			ls.insertdata(i); // Method from linkedlist2
		}
		ls.show1(); // -------//Method from linkedlist2

		boolean flag = true;
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		for (int i = 0; i < array.length; i++)
		{
			if (num == array[i]) {
				ls.removeatindex1(i);
				System.out.println("removing value------------");
				flag = false; // Method from linkedlist2
			}

		}
		if (flag) {
			System.out.println("After adding value--------------");

			ls.insertdata(num); // Method from linkedlist2

		}
		ls.sortList(); // Method from linkedlist2
		ls.show1(); // Method from linkedlist2

	}
}
