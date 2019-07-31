package com.bridgelabz.algorithmprogram;

public class DecimalToBinary
{
	public static int[] D2B()
	{
		int[] binaryNum = new int[10];

		int n = MyUtil.scannerforinteger();

		int i = 0;
		while (n > 0) {
             
			binaryNum[i] = n % 2;

			n = n / 2;
			i++;
		}
 
		for (int j = i; j >= 0; j--)
		{
			System.out.print(binaryNum[j]);
		}
			return binaryNum;
	}

	public static void main(String[] args) {
		D2B();

	}
}