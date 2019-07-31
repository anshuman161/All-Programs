package com.bridgelabz.functionalprograme;

import java.util.Scanner;

public class Glambing
{
	
	static void play(int stake, int goals, int trials)
	{
		int wins=0;
		int bets=0;
		int loss=0;
		  for (int t = 0; t < trials; t++)
		 {	       
			 
			
	            while (stake > 0 && stake < goals) 
	            {
	              bets++;
	             
	                if (Math.random() < 0.5) 
	                {
	                	stake++;    
	                }
	                	else
	                { 
	                	stake--;
	                }
	            }
	            if(stake == goals)
	            {
	            	wins++;
	            }
	            else {
					loss++;
				}
	        }
		
	        
	        System.out.println(wins + " wins of " + trials);
	       
	        System.out.println("% of games won = " + 100.0 * (wins / trials));
	        
	        System.out.println("% of games loss  = " + 100.0 * (loss / trials));
	    }

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int stake=s.nextInt();
		int goals=s.nextInt();
		int trials=s.nextInt();
		play(stake,goals,trials);
		
	}
}