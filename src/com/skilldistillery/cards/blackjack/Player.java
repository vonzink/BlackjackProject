package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	// NO MORE FIELDS
	// NO GETTER FOR THE HAND

	protected BlackjackHand hand;

	public Player() {
		hand = new BlackjackHand();
	}

	public void hit(Card card) {
		hand.addCard(card);
	}

	public void displayHand() {
		hand.displayHand(true);
	}

	public boolean isBust() {
		return hand.isBust();
	}

	public boolean isBlackjack() {
		return hand.isBlackjack();
	}

	public void stand() {
		System.out.println("Player stands with a total of ");
	}

	public void resetHand() {
		hand.resetHand();
	}

	public int getHandValue() {
		return hand.getHandValue();
	}
}
