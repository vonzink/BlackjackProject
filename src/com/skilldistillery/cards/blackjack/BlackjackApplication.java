package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {
	
	//NO MORE FIELDS
	//NO DECK TYPE VARIABLES
	
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
		this.sc = new Scanner(System.in) ;
		System.out.println("Welcome to Blackjack!");
		System.out.println();
		do {
			playRound(); 
			System.out.println("play another round?");
			String answer = sc.nextLine(); 
			if (answer.equalsIgnoreCase("n")); 
			playAgain(); 
				
		} while (playAgain()); 
	  System.out.println(", goodbye!");
	}
	public void playRound() {
		dealer.reset();
		player.resetHand();
		dealer.beginPlay(player);
		playersTurn(); 
		System.out.print("Dealers Hand: ");
			dealer.displayHand(false);
			System.out.println();
		System.out.println("Players Hand ");
			player.getHandValue(); 
	}
	private void playersTurn() {
		this.sc = new Scanner(System.in) ;
		player.getHandValue(); 
		
	}
	public void dealersTurn() {
		
		
	public boolean playAgain() {
		boolean playAgain = false; 
		System.out.println("play another round?");
		String answer = sc.nextLine(); 
		if (answer.equalsIgnoreCase("y")); 
		return playAgain = true; 
	}

}
