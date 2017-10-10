package com.o2.cards;

import java.util.ArrayList;
import java.util.List;

public class RuleSet {

	List<IRule> rules ;
	
	public RuleSet()
	{
		rules = new ArrayList<IRule>();
		rules.add(new HighCardRule());
		rules.add(new ThreeOfAKind());
	}
	
	/*public void add(IRule rule)
	{
		rules.add(rule);
	}*/
	
	public Person apply(Person p1, Person p2) {
		Person p=null;
        for (IRule rule : rules) {
            p  = (Person) rule.applyRule(p1, p2);
            if(null!=p)
            {
            	break;
            }
        }
        return p;
    }
}
