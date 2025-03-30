package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	// WARNING NO FIELDS

	public BlackjackHand() {
	}
	@Override
	public int getHandValue() {
		int total = 0;
		int aces = 0;
		for (Card card : cardsInHand) {
			if (card.getValue() == 11)
				aces++;

			if (total > 21 && aces > 0) {
				total -= 10;
				aces--;
			}
			total += card.getValue();

		}
		return total;
	}

	public boolean isBlackjack() {
		return (cardsInHand.size() == 2 && getHandValue() == 21);
	}

	public boolean isBust() {
		return getHandValue() > 21;
	}

	public void displayHand(boolean showAll) {
		for (int i = 0; i < cardsInHand.size(); i++) {
			if (!showAll && i == 0) {
				System.out.println("[\u2665\u2666\u2660\u2663]" + " - face down card");
			} else {
				System.out.println(cardsInHand.get(i).toString());
			}

		}
	}
}
