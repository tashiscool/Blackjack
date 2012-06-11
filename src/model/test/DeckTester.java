
package model.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import model.Card;
import model.Deck;
import org.junit.Test;

public class DeckTester {
	@Test
	public void testDeckSize()
	{
		Deck deck = new Deck();
		assertEquals(deck.size(), 52);
	}
	
	@Test
	public void testRandomCard()
	{
		Deck deck = new Deck();
		String[] validarr = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		Map<String, Integer> cardcounter = new HashMap<String, Integer>();
		for (int i = 0; i< 52; i++)
		{
			Card card = deck.getRandomCard();
			String cardvalue = card.getValue();
			if (cardcounter.get(cardvalue) == null)
				cardcounter.put(cardvalue, 1);
			else
			{
				int count = cardcounter.get(cardvalue).intValue();
				cardcounter.put(cardvalue, new Integer(++count));
			}
		}
		for (String arr : validarr)
		{
			assertEquals(cardcounter.get(arr).intValue(), 4);
		}
	}
}
