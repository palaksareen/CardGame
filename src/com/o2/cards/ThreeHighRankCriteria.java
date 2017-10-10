package com.o2.cards;

import java.util.List;

public class ThreeHighRankCriteria implements ICriteria{
	
	public Object applyCriteria(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		int a = object1.stream().map(Card :: getRank).map(CardRank :: getValue).findFirst().get();
		int b = object2.stream().map(Card :: getRank).map(CardRank :: getValue).findFirst().get();
		
		return ((a>b)? p1 : p2);
	}

}
