package model;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class Deck {
	
	Card[] carddeck = new Card[52]; 

	public Deck() {

		String[] validValues = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"}; //TODO: make these enums when Colin learns about these
		String[] validSuits = {"Clubs", "Spades", "Hearts", "Diamonds"}; //TODO: same as above comment
		int i = 0;
		for (String arr : validValues)
		{
			for (String suit : validSuits)
			{
				carddeck[i] = new Card(arr,suit);
				i++;
			}
		}
	}

	public int size() {
		return carddeck.length;
	}

	public Card getRandomCard() {
		int cardIndex = (int) Math.floor(52*Math.random());
		while (carddeck[cardIndex].isUsed())
		{
			cardIndex = (int) Math.floor(52*Math.random());
		}
		carddeck[cardIndex].setUsed(true);
		return carddeck[cardIndex];
	}

}
