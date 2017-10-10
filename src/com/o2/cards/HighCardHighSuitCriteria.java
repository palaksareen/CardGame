package com.o2.cards;

import java.util.List;

public class HighCardHighSuitCriteria implements ICriteria {

	@Override
	public Object applyCriteria(Person p1, Person p2)
	{

		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		int highSuitObject1 = object1.stream().map(Card :: getSuit).map(CardSuit :: getValue).max(Integer :: max).get();
		
		int highSuitObject2 = object2.stream().map(Card :: getSuit).map(CardSuit :: getValue).max(Integer :: max).get();
		
		return ((highSuitObject1 > highSuitObject2)? p1 : p2);
	}
}
