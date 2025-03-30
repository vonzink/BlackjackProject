package com.skilldistillery.cards.common;

public enum Suit {

	HEARTS("\u2665" + " Hearts"), DIMONDS("\u2666" + " Dimonds"), SPADES("\u2660" + " Spades"),
	CLUBS("\u2663" + " Clubs");

	private final String name;

	Suit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
