package com.bridgelabz.algorithmprogram;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordFromList {
	public static void main(String[] args) throws IOException {
		
		String nline = "";
		
		File f=new File("/home/admin1/Desktop/xyz.txt");
		 Scanner sc = new Scanner(f); 
		    while (sc.hasNextLine()) 
		    {
		      nline=sc.nextLine();
		    }
		    String[] strArray = nline.split(" ");
		      for (int i = 0; i < strArray.length; i++) 
		      {
				System.out.println(strArray[i]);
			  }
		    Scanner sc1 = new Scanner(System.in);
		      String getstring=sc1.next();
		          		  
		            for (int i = 0; i < strArray.length-1; i++)
		              {
						  if (strArray[i].equals(getstring))
						  {
							 System.out.println("Yes..word is found");
							 break;
						  }
						  
					  }
	}
}
//not done