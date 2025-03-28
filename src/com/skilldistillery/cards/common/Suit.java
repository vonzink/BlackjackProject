package com.skilldistillery.cards.common;

public enum Suit {

	HEARTS("Hearts"), DIMONDS("Dimonds"), SPADES("Spades"), CLUBS("Clubs");

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
