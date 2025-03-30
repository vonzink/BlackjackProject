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
		System.out.println("Dealers Hand: ");
		dealer.displayHand(false);
		System.out.println();
		player.displayHand();
		System.out.println("Total: " + player.getHandValue());
		playersTurn();
	}

	private void playersTurn() {

		if (dealer.isBlackjack()) {
			System.out.println("Dealer got Blackjack!");
			return;
		}

		while (dealer.getHandValue() < 17) {
			dealer.hit(dealer.dealCard());
			System.out.println("Dealer hits:");
			dealer.displayHand(true);

			if (dealer.isBust()) {
				System.out.println("Dealer busts with a total of " + dealer.getHandValue());
				return;
			}
		}

		System.out.println("Dealer stands with a total of " + dealer.getHandValue());
	}

	public void dealersTurn() {

		while (dealer.getHandValue() < 17) {
			dealer.hit(dealer.dealCard());
			System.out.println("Dealer hits:");
			dealer.displayHand(true);
		}
		System.out.println("Dealer stands with a total of " + dealer.getHandValue());
	}

	public boolean playAgain() {
		System.out.println("play another round?");
		String answer = sc.nextLine();
		return answer.equalsIgnoreCase("y");
	}
}
