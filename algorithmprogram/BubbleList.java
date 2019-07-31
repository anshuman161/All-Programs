package com.bridgelabz.algorithmprogram;


import java.io.IOException;
import java.util.Scanner;

public class BubbleList 
{
       public static void main(String[] args) throws IOException
       {
    	   Scanner s = new Scanner(System.in);

   		int n = s.nextInt();

   		int[] number = new int[n];

   		System.out.println("elements are:");

   		for (int i = 0; i < n; i++)

   		{
           
   			number[i] = s.nextInt();
          
   		}
    	   
    	 
   		int temp = 0;
   		for (int i = 0; i < number.length; i++) {
   			int flag = 0;
   			for (int j = 0; j < number.length - 1 - i; j++) {
   				if (number[j] > number[j + 1]) {
   					temp = number[j];
   					number[j] = number[j + 1];
   					number[j + 1] = temp;
   					flag = 1;//agar iske aage ki list alreadr sorted h to loop k bahar kr dega
   				}
   			}
   			if (flag == 0) {
   				break;
   			}
   		}
   		for (int i = 0; i < number.length; i++) {
   			System.out.println(number[i] + " ");
   		}
       }
}
