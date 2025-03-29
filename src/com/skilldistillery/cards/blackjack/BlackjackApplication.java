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
		boolean playAgain = true; 
		this.sc = new Scanner(System.in) ;
		System.out.println("Welcome to Blackjack!");
		System.out.println();
		do {
			playRound(); 
			String answer = sc.nextLine(); 
			if (answer.equalsIgnoreCase("n")); 
			playAgain = false; 
				
		} while (playAgain = true); 
	  System.out.println(", goodbye!");
      sc.close();
	}
	public void playRound() {
		dealer.reset();

		dealer.beginPlay(player);
		
		playersTurn(); 
			
	}
	private void playersTurn() {
		// TODO Auto-generated method stub
		
	}
	public void dealersTurn() {
		
	}

}
