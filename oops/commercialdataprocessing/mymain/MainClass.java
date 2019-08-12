package com.bridgelabz.oops.commercialdataprocessing.mymain;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.commercialdataprocessing.myclass.UserBusinessStock;

public class MainClass extends UserBusinessStock
{

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
      MainClass myclass=new MainClass();
		System.out.println("Please enter -Buy or Sell");
      Scanner sc = new Scanner(System.in);
		String request = sc.nextLine();
        
		switch (request) {
		case "buy":
			      myclass.forbuy();
           
			break;

		case "sell":
			   myclass.forsell();
            
			break;

		default:
			break;
		}

	}
}
