//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack{

	boolean gameCurrently;
	Scanner keyboard = new Scanner(System.in);

	Player player = new Player();
	Card card = new Card();
	Dealer dealer = new Dealer();
	Deck deck = new Deck();
	Money money = new Money();

	public BlackJack(){
		money.originalMoney(); //gives the player starting money
	}

	public static void main(String[] args){
		BlackJack game = new BlackJack();
		game.playGame();
	}

	public void playGame(){
		//welcome and rules
		player.printRules();
		System.out.println("type 'y' to start!");
		String response = keyboard.next();

		if (response.charAt(0) == 'y'){
			//money.originalMoney(); //gives the player starting money
			dealer.shuffle(); //shuffles the deck at the start of each round
			gameCurrently = true;
		}
			
			while (gameCurrently == true){

				if (money.placeBet() == true) { //ask for the player to place a bet before playing

					player.addCardToHand(dealer.deal()); //each player starts with two cards
					dealer.addCardToHand(dealer.deal()); //dealer starts with one to show, then gains another.
					player.addCardToHand(dealer.deal());

					System.out.println("Your cards:");
					System.out.println(player.toString());
					
					System.out.println("The dealer's first card: ");
					System.out.println(dealer.toString());

					dealer.addCardToHand(dealer.deal());

					if (player.getHandValue() == 21) { //check for naturals after first dealt
						System.out.println("You got a natural!");
						money.naturalWin();
						player.winCount++;
						gameCurrently = false;
					}

				while (player.hit() == true) { //lets the player hit again and again until they either bust or chose to stop
					player.addCardToHand(dealer.deal());
					System.out.println("You chose to hit. Your current cards are now shown below.");
					System.out.println("Your hand: " + player.toString());

					//Player busts!
					if (player.getHandValue() > 21){
						System.out.println("Dealer wins; you went over 21!");
						gameCurrently = false;
						break;
					}	
				}

				//dealer plays if player didn't bust
				if (player.getHandValue() <= 21){
					while (dealer.getHandValue() < 17) {
						System.out.println("The dealer chose to hit (<17).");
						dealer.addCardToHand(dealer.deal());
						System.out.println("Dealer's hand: " + dealer.toString());

						//Dealer busts!
						if (dealer.getHandValue() > 21){
							System.out.println("Dealer busts - they went over 21! Player wins.");
							gameCurrently = false;
							money.winMoney();
							player.winCount++;
							break;
						}
					}	
				}
				
				if (player.getHandValue() <= 21 && dealer.getHandValue() <= 21){
					//win conditions
					if (player.getHandValue() > dealer.getHandValue()) { //Player > Dealer (win)
						System.out.println("Player has the higher hand value - they win!");
						gameCurrently = false;
						money.winMoney();
						player.winCount++;

					} else if (dealer.getHandValue() > player.getHandValue()) { //Dealer > Player (lose)
						System.out.println("Dealer has the higher hand value - they win!");
						gameCurrently = false;

					} else if (dealer.getHandValue() == player.getHandValue()) { //Dealer = Player (tie)
						System.out.println("Player has the higher hand value - they win!");
						gameCurrently = false;
						money.tieMoney();
					}				
				}

				} else { //if they didn't place a bet originally, re-prompt
					money.placeBet();
				}
			}

		if (money.getMoney() != 0){
			playAgain();
		}
	}
	
	
	public void playAgain() {
		System.out.println("You have: " + player.getWinCount() + " win(s).");
		player.resetHand();
		dealer.resetHand();
		System.out.println("Do you want to play again? (y/n)");
		String response = keyboard.next();
		if (response.charAt(0) == 'y'){
			playGame();
		}
	}
}
	
