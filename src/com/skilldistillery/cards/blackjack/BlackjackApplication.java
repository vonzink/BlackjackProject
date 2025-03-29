package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {

	// NO MORE FIELDS
	// NO DECK TYPE VARIABLES

	private Scanner sc;
	private Dealer dealer;
	private Player player;

	public static void main(String[] args) {
		new BlackjackApplication().launch();

	}

	public BlackjackApplication() {
		this.dealer = new Dealer();
		this.player = new Player();
	}

	public void launch() {
		this.sc = new Scanner(System.in);
		System.out.println("Welcome to Blackjack!");
		System.out.println();
		do {
			playRound();

		} while (playAgain());
		System.out.println(", goodbye!");
	}

	public void playRound() {
		dealer.reset();
		player.resetHand();
		dealer.beginPlay(player);
		System.out.print("Dealers Hand: ");
		dealer.displayHand(false);
		System.out.println();
		player.displayHand();
		System.out.println(player.getHandValue());
		playersTurn();
	}

	private void playersTurn() {
		System.out.println("Do you want to hit or stay?");
		String hit = sc.nextLine();
		if (hit.equalsIgnoreCase("hit")) {
			player.hit(dealer.dealCard());
			player.displayHand();
			if (player.getHandValue() > 21) {
				System.out.println("Bust!");
			} else {
				this.playersTurn();
			}
		}
	}

	public void dealersTurn() {
		dealer.getHandValue();
	}

	public boolean playAgain() {
		boolean playAgain = true;
		System.out.println("play another round?");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("y"))
			;
		return playAgain;
	}

}
