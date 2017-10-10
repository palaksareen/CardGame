package com.o2.cards;

public class Card {

	private CardRank rank;
	private CardSuit suit;
	
	Card(CardRank rank, CardSuit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public CardRank getRank() {
		return rank;
	}
	public void setRank(CardRank rank) {
		this.rank = rank;
	}
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	
	
}
