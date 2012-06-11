package model;

public class Card {

	String value;
	String suit;
	boolean used = false;
	
	public Card(String arr, String suit2) {
		value = arr; 
		suit = suit2;
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	public String getSuit()
	{
		return suit;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}

}
