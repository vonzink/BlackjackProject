package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

		//WARNING: NO GETTER FOR CARDS IN HAND
	
	protected List<Card> cardsInHand; 
	
	public Hand() {
		cardsInHand = new ArrayList<>(); 
	}
	
	public void addCard(Card card) {
	cardsInHand.add(card); 
	}
	
	public void clear() {
		cardsInHand.clear(); 
	}
	
	public abstract int getHandValue();
	
	@Override
	public String toString() {
		return String.format("Hand [cardsInHand=%s]", cardsInHand);
	} 
	
}
