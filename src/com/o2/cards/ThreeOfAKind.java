package com.o2.cards;

import java.util.ArrayList;
import java.util.List;

public class ThreeOfAKind implements IRule
{
	
	HighCardRule highrule = new HighCardRule();
	List<ICriteria> criterias = new ArrayList<>();
	
	ThreeOfAKind()
	{
		criterias.add(new ThreeSameRankCriteria());
		criterias.add(new ThreeHighRankCriteria());
	}
	@Override
	public Object applyRule(Person p1, Person p2) 
	{
		//return applyThreeSameRank(p1,p2);
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

	/*public Object applyThreeSameRank(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		boolean object1SameRank = object1.stream().map(Card :: getRank).map(CardRank :: getValue).allMatch(e -> e.equals(object1.get(0).getRank().getValue()));
		boolean object2SameRank = object2.stream().map(Card :: getRank).map(CardRank :: getValue).allMatch(e -> e.equals(object2.get(0).getRank().getValue()));
	
		return ((object1SameRank && object2SameRank)? applyThreeHighRank(p1, p2) : ((object1SameRank)? p1 :p2));
	}
	
	public Object applyThreeHighRank(Person p1, Person p2)
	{
		List<Card> object1 = p1.getCards();
		List<Card> object2 = p2.getCards();
		
		int a = object1.stream().map(Card :: getRank).map(CardRank :: getValue).findFirst().get();
		int b = object2.stream().map(Card :: getRank).map(CardRank :: getValue).findFirst().get();
		
		return ((a>b)? p1 : ((b>a)? p2 : highrule.applyRule(p1, p2)));
	}*/
}
