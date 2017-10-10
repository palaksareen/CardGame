package com.o2.cards;

public enum CardSuit {

	CLUBS(1),
	DIAMONS(2),
	SPADES(3),
	HEARTS(4);
	
	private int value;
	
	CardSuit(int value)
	{
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
