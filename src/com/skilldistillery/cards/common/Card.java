package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {
//FIELDS
	private Suit suit;
	private Rank rank;

//CONSTRUCTORS
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public Card(Rank rank, Suit suit) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
//METHODS

//GETTERS
	public int getValue() {
		return rank.getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

}
