package com.bridgelabz.functionalprograme;

public class Permutation 
{
	
	 static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
	
		ch[i] = ch[j];
	
		ch[j] = temp;
	
	}

	
	 static void permutations(char[] ch, int Index,int a)
	{
		 System.out.println("  start");
		  
		if (Index == a)
		{		
			System.out.println(ch);
		}

		for (int i = Index; i < a; i++)
		{
			
			    swap(ch, Index, i);
			    permutations(ch, Index+1, a);
			    swap(ch, Index, i);
		}
	}
	public static void main(String[] args)
	{
		String s ="ABC";
		int a=s.length();
		char[] ch=s.toCharArray();
		permutations(ch, 0,a);
	}
}