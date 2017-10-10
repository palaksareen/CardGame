package com.o2.cards;

import java.util.Arrays;

public class CardMainClass {

	public static void main(String[] args)
	{

		Person p1 = new Person("john", Arrays.asList(new Card(CardRank.TEN, CardSuit.CLUBS), new Card(CardRank.JACK, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		Person p2 = new Person("bob", Arrays.asList(new Card(CardRank.NINE, CardSuit.CLUBS), new Card(CardRank.THREE, CardSuit.HEARTS), new Card(CardRank.EIGHT, CardSuit.DIAMONS)));
		
		RuleSet ruleSet = new RuleSet();
		//ruleSet.add(new HighCardRule());
		Person winner = ruleSet.apply(p1,p2);
		System.out.print(winner.getName() + "\n" );
		
		Person p9 = new Person("john", Arrays.asList(new Card(CardRank.TEN, CardSuit.CLUBS), new Card(CardRank.JACK, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		Person p10 = new Person("bob", Arrays.asList(new Card(CardRank.JACK, CardSuit.CLUBS), new Card(CardRank.THREE, CardSuit.HEARTS), new Card(CardRank.EIGHT, CardSuit.SPADES)));
		Person winner5 = ruleSet.apply(p9,p10);
		System.out.print(winner5.getName() + "\n" );
		
		Person p3 = new Person("A", Arrays.asList(new Card(CardRank.TEN, CardSuit.CLUBS), new Card(CardRank.TEN, CardSuit.HEARTS), new Card(CardRank.TEN, CardSuit.DIAMONS)));
		Person p4 = new Person("B", Arrays.asList(new Card(CardRank.NINE, CardSuit.CLUBS), new Card(CardRank.THREE, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		RuleSet ruleSet2 = new RuleSet();
		//ruleSet2.add(new ThreeOfAKind());
		Person winner2 = ruleSet2.apply(p3,p4);
		System.out.print(winner2.getName() + "\n");
		
		
		Person p5 = new Person("DGDF", Arrays.asList(new Card(CardRank.JACK, CardSuit.CLUBS), new Card(CardRank.JACK, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		Person p6 = new Person("FDGDF", Arrays.asList(new Card(CardRank.ACE, CardSuit.CLUBS), new Card(CardRank.ACE, CardSuit.HEARTS), new Card(CardRank.ACE, CardSuit.DIAMONS)));
		Person winner3 = ruleSet2.apply(p5,p6);
		System.out.print(winner3.getName()+ "\n");
		
		
		/*Person p7 = new Person("DGDF", Arrays.asList(new Card(CardRank.JACK, CardSuit.CLUBS), new Card(CardRank.JACK, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		Person p8 = new Person("FDGDF", Arrays.asList(new Card(CardRank.JACK, CardSuit.CLUBS), new Card(CardRank.JACK, CardSuit.HEARTS), new Card(CardRank.JACK, CardSuit.DIAMONS)));
		Person winner4 = ruleSet2.apply(p7,p8);
		System.out.print(winner4.getName());*/
	}
}
