package com.o2.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighCardRule implements IRule{

	List<ICriteria> criterias = new ArrayList<>();
	HighCardRule()
	{
		criterias.add(new HighCardHighRankCriteria());
		criterias.add(new HighCardHighSuitCriteria());
	}
	@Override
	public Object applyRule(Person p1, Person p2)
	{
		//return applyHighRank(p1,p2);
		Person p = null;
		for(ICriteria criteria: criterias)
		{
			p = (Person) criteria.applyCriteria(p1, p2);
			if(null != p)
			{
				break;
			}
		}
		return p;
	}
	
	/*public Object applyHighRank(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		int highRankObject1 = object1.stream().map(Card :: getRank).map(CardRank :: getValue).max(Integer :: max).get();
		
		int highRankObject2 = object2.stream().map(Card :: getRank).map(CardRank :: getValue).max(Integer :: max).get();
		
		return ((highRankObject1 > highRankObject2)? p1 : ((highRankObject2 > highRankObject1) ? p2 : applyHighSuit(p1,p2)));
	}
	
	public Object applyHighSuit(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		int highSuitObject1 = object1.stream().map(Card :: getSuit).map(CardSuit :: getValue).max(Integer :: max).get();
		
		int highSuitObject2 = object2.stream().map(Card :: getSuit).map(CardSuit :: getValue).max(Integer :: max).get();
		
		return ((highSuitObject1 > highSuitObject2)? p1 : p2);
	}*/
}
