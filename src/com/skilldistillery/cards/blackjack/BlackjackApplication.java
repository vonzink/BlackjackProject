package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {
	
	//NO MORE FIELDS
	//NO DECK TYPE VARIABLES
	
	private Scanner SC; 
	private Dealer dealer; 
	private Player player; 
	
	public BlackjackApplication() {
		this.SC = new Scanner(System.in) ;
			this.dealer = new Dealer();
			this.player = new Player(); 
	}

	public static void main(String[] args) {
		new BlackjackApplication().launch();

	}
	public void launch() {
	}
	
	public void playRound() {
		
	}

}
