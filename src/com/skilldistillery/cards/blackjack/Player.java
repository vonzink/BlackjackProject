package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	//NO MORE FIELDS
	//NO GETTER FOR THE HAND
	
	protected BlackjackHand hand; 
	
	public Player() {
		hand = new BlackjackHand(); 
	}
	public void hit(Card card) {
		hand.addCard(card);
	}
	
	public void stand() {
		//skip
	}
	
	public void resetHand() {
		hand.clear(); 	
	}
	public int getHandValue(){
		return hand.getHandValue(); 
	}
}
