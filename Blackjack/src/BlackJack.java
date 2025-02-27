//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack{

	boolean gameCurrently;
	//add in Player instance variable
	//add in Dealer instance variable

	public BlackJack(){
		Scanner keyboard = new Scanner(System.in);
		boolean playRound;

		Player player = new Player();
		Card card = new Card();
		Dealer dealer = new Dealer();
		Deck deck = new Deck();
		Money money = new Money();

		//welcome and rules
		player.printRules();
		System.out.println("type 'y' to start!");
		String response = keyboard.next();

		if (response.charAt(0) == 'y'){
			money.originalMoney(); //gives the player starting money
			money.placeBet(); //ask for the player to place a bet before playing
			dealer.shuffle(); //shuffles the deck at the start of each round
			
			if (money.placeBet() == true) {

			
			player.addCardToHand(dealer.deal()); //each player starts with two cards
			dealer.addCardToHand(dealer.deal());
			player.addCardToHand(dealer.deal());
			
			System.out.println("Your cards: " + player.toString() + " Value: " + player.getHandValue() + " Number of Cards: " + player.getHandSize());
			
			
			//System.out.println("The dealer's first card: " + dealer.toString() + "Value: " + dealer.getHandValue());
			//dealer.addCardToHand(dealer.deal());
			} else {
				money.placeBet();
			}
		}
	}


	public static void main(String[] args){
		BlackJack game = new BlackJack();
		game.playGame();
	}

	public void playGame(){

	}
	

}