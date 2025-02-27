//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack{

	
	//add in Player instance variable
	//add in Dealer instance variable

	public BlackJack(){
		Scanner keyboard = new Scanner(System.in);
		char choice; // y or n depending if they want to play

		Player player = new Player();
		Card card = new Card();
		Dealer dealer = new Dealer();
		Deck deck = new Deck();
		Money money = new Money();


		//welcome and rules
		player.printRules();
	}

	public void playGame(){

	}
	
	public static void main(String[] args){
		BlackJack game = new BlackJack();
		game.playGame();
	}
}