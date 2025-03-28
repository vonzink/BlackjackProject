package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//WARNING: Do not generate a getter for cards
	
		final int DECKSIZE = 52; 
	
	private List<Card> cards = new ArrayList<>(DECKSIZE);
	
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public int checkDeckSize() {
		return cards.size(); 
	}
	public Card dealCard () {
		if (cards.isEmpty()) return null; 
		return cards.remove(0); 
	}
	public Deck shuffle() {
		Collections.shuffle(cards); 
		return this;
	}
}
