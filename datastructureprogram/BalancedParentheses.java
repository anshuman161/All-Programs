package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.MyStack;

public class BalancedParentheses 
{
	public static void main(String[] args) 
	{
		String input = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char[] ch = input.toCharArray();
             int len=ch.length;		
             MyStack st=new MyStack();
            st.setSize(len);
            int size=st.getSize();
	
		
		
		
		st.pushandpop(ch);
		boolean b = st.isEmpty();
		if (b == true) 
		{
			System.out.println("Parentheses is balanced");
		}
		else
		{
			System.out.println("Parentheses is Not balanced");
		}

	}
	
}



