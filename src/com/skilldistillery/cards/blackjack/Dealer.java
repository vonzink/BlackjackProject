package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	// NO MORE FIELDS
	// NO GETTER FOR THE DECK

	private Deck deck;

	public Dealer() {
		super();
		deck = new Deck();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void beginPlay(Player hand) {
		hand.hit(dealCard());
		this.hit(dealCard());
		hand.hit(dealCard());
		this.hit(dealCard());
	}

	public void displayHand(boolean call) {
		hand.displayHand(call);
	}

	public void reset() {
		hand.resetHand();
		deck.shuffle(); 
	}
}
