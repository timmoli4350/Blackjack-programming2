//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb. 2025

public class Dealer extends Player {
	//define a deck of cards
	public static int cardCount = 52;
	private Deck cardDeck;

	public Dealer() {
		cardDeck = new Deck();
	}

	public void shuffle(){
	   cardDeck.shuffle();
	}

	public Card deal(){
	   return cardDeck.nextCard();
	}
	
	public int numCardsLeftInDeck(){
		return 0;
	}

	public boolean hit(){
	   return false;
    }

	
}








