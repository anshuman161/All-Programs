package com.bridgelabz.oopsprograme;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.LinkedList;

public class CompanyShare 
{  
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();
     

      System.out.println("Enter Company name");
      String company=sc.nextLine();
       
      System.out.println("Enter company shares ");
      String share=sc.nextLine();
      
            
      System.out.print("Enter 1 for insert or   ");
      System.out.println("Enter 2 for delete");
      int button=sc.nextInt();
      switch (button) 
      {
	case 1:
		String write=sc.nextLine();
	    list.insert(write);
		break;
case 2:
	    int remove=sc.nextInt();
     	list.removeatindex(remove);
		break;
		
	default:
		break;
  	 }
     JSONObject json=new JSONObject();
     json.put(company,list);
     
     JSONArray employeeList = new JSONArray();
     employeeList.add(json);
     
     
     list.show();
      
      
      
  } 
}
