package com.o2.cards;

import java.util.List;

public class HighCardHighRankCriteria implements ICriteria{

	@Override
	public Object applyCriteria(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		int highRankObject1 = object1.stream().map(Card :: getRank).map(CardRank :: getValue).max(Integer :: max).get();
		
		int highRankObject2 = object2.stream().map(Card :: getRank).map(CardRank :: getValue).max(Integer :: max).get();
		
		return ((highRankObject1 > highRankObject2)? p1 : ((highRankObject2 > highRankObject1) ? p2 : null));
	}
}
