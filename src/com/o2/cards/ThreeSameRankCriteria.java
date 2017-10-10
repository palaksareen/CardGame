package com.o2.cards;

import java.util.List;

public class ThreeSameRankCriteria implements ICriteria{

	public Object applyCriteria(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		boolean object1SameRank = object1.stream().map(Card :: getRank).map(CardRank :: getValue).allMatch(e -> e.equals(object1.get(0).getRank().getValue()));
		boolean object2SameRank = object2.stream().map(Card :: getRank).map(CardRank :: getValue).allMatch(e -> e.equals(object2.get(0).getRank().getValue()));
	
		return ((object1SameRank && object2SameRank)? null : ((object1SameRank)? p1 :p2));
	}
}
