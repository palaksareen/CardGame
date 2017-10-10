package com.o2.cards;

import java.util.List;

public class Person {

	private String name;
	private List<Card> cards;

	Person(String name, List<Card> cards)
	{
		this.name = name;
		this.cards = cards;
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
