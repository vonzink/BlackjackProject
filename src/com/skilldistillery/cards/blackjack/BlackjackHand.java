package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	// WARNING NO FIELDS

	public BlackjackHand() {}
	
	
	@Override
	public int getHandValue() {
		return 0;
	}
	
	public Boolean isBlackjack() {
		return (cardsInHand.size() == 2 && getHandValue() == 21);
	}

	public Boolean isBust() {
		return getHandValue() > 21;
	}

	public void displayHand(boolean showAll) {
		for (int i = 0; i < cardsInHand.size(); i++) {
			if (!showAll && i == 0) {
				System.out.println("[Dealer Card]");
			} else {
				System.out.println(cardsInHand.get(i).toString());
			}
		}
	}
}

