package com.bridgelabz.oops.deckofcard.implementation;

public class DeckOfCard 
{
  public static void main(String[] args) 
  {
	 String[] SUITS= {"Clubs", "Diamonds", "Hearts", "Spades"};
	 String[] RANK= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
      int size=SUITS.length*RANK.length;  
	 String[] deck=new String[size];
	 
	 for (int i = 0; i < RANK.length; i++) {
		for (int j = 0; j < SUITS.length; j++) {
			deck[SUITS.length*i+j]= RANK[i]+" "+SUITS[j];
		}
	}

		for (int i = 0; i < deck.length; i++) {
			int var1 = i + (int) (Math.random() * (deck.length - i));
			String temp = deck[var1];
			deck[var1] = deck[i];
			deck[i] = temp;
		}
 
  for (int i = 0; i < 4; i++) {
	System.out.println("PERSON NO "+(i+1)+" ");
	for (int j = 0; j < 9; j++) 
	{
	 System.out.println(deck[i+j+4]+" card ");	
	}
}
  
  }
}
