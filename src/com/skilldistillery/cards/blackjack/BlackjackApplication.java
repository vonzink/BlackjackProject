package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {

	// NO MORE FIELDS
	// NO DECK TYPE VARIABLES

	private Scanner sc;
	private Dealer dealer;
	private Player player;

	public BlackjackApplication() {
		this.dealer = new Dealer();
		this.player = new Player();
	}

	public static void main(String[] args) {
		new BlackjackApplication().launch();

	}

	public void launch() {
		this.sc = new Scanner(System.in);
		System.out.println("Welcome to Blackjack!");
		System.out.println();
		do {
			playRound();
		} while (playAgain());
		System.out.println("thanks for playing! goodbye!");
	}

	public void playRound() {
		dealer.reset();
		player.resetHand();
		dealer.beginPlay(player);
		System.out.println("Dealers Hand: ");
		dealer.displayHand(false);
		System.out.println();
		System.out.println("Players Hand: ");
		player.displayHand();
		System.out.println();
		playersTurn();
	}

	private void playersTurn() {

		System.out.println("Player has: " + player.getHandValue());
		if (player.isBlackjack()) {
			System.out.println("Player Got Blackjack!");
			return;
		}
		do {
			System.out.println("would you like to HIT or STAY?");
			System.out.println("'h' or 'hit' to hit.. anything else to stay");
			String answer = sc.nextLine();

			if ((answer.equalsIgnoreCase("hit")) || (answer.equalsIgnoreCase("h"))) {
				player.hit(dealer.dealCard());
				player.displayHand();
				System.out.println("Player has: " + player.getHandValue());
				if (player.isBust()) {
					System.out.println("Player busts with a total of " + player.getHandValue());
					return;
				}
			} else {
				player.stand();
				System.out.println(" " + player.getHandValue());
				break;
			}
		} while (true);

		System.out.println("Player stands with a total of " + player.getHandValue());
		dealersTurn();
	}

	public void dealersTurn() {

		if (dealer.isBlackjack()) {
			System.out.println("Dealer got Blackjack!");
			return;
		}
		while (dealer.getHandValue() < 17) {
			dealer.hit(dealer.dealCard());
			System.out.println("Dealer hits:");
			dealer.displayHand(true);
			dealer.getHandValue();
		}
		if (dealer.isBust()) {
			System.out.println("Dealer busts with a total of " + dealer.getHandValue());
			return;
		}
		System.out.println("Dealer stands with a total of " + dealer.getHandValue());
	}

	public boolean playAgain() {
		checkWinner();
		System.out.println();
		System.out.println("play another round?");
		String answer = sc.nextLine();
		return (answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"));
	}

	public void checkWinner() {
		int playerValue = player.getHandValue();
		int dealerValue = dealer.getHandValue();
		boolean playerBust = player.isBust();
		boolean dealerBust = dealer.isBust();

		if (playerBust) {
			System.out.println("PLAYER BUSTS DEALER WINS!");
			System.out.println("Player: " + playerValue + " Dealer: " + dealerValue);
		} else if (dealerBust) {
			System.out.println("DEALER BUSTS PLAYER WINS!");
			System.out.println("Player: " + playerValue + " Dealer: " + dealerValue);
		} else if (playerValue == dealerValue) {
			System.out.println("ITS A PUSH");
		} else if (playerValue > dealerValue) {
			System.out.println("PLAYER WINS!!");
			System.out.println("Player: " + playerValue + " Dealer: " + dealerValue);
		} else
			System.out.println("DEALER WINS");
		System.out.println("Player: " + playerValue + " Dealer: " + dealerValue);

	}
}
