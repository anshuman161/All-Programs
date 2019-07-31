package com.bridgelabz.functionalprograme;


public class AddsToZero {
	static boolean getadd(int[] array, int n) {
		boolean demo = true;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < n ; j++) 
			{
				for (int j2 = j+1; j2 < n; j2++)
				{
					if (array[i] + array[j] + array[j2] == 0) 
					{
						    System.out.println(array[i]+" "+array[j]+" "+array[j2]); 
		                    
						return true;
					}
				}
			}
			if (demo == false) 
			{
				System.out.println("not exist");
			}
		}
		return demo;
	}

	public static void main(String[] args)
	{
		int[] array = { -1,0,1};
		int n = array.length;
		getadd(array, n);
	}
}