//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {
	
	public static final int NUMCARDS = 52;
	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
	private int topCardIndex;
	private ArrayList<BlackJackCard> stackOfCards;
	//new ArrayList - define

	public Deck (){
		//initialize data - stackOfCards - topCardIndex
		topCardIndex = 52;
		stackOfCards = new ArrayList<>();
		//loop 1-52 stackOfCards.add(new BlackJackCard) !!!!!!!
        
        for (int i = 0; i <= NUMCARDS; i++){
			BlackJackCard newCard = new BlackJackCard(i);
			stackOfCards.add(newCard);
			//System.out.println(newCard);
		}
		shuffle();
	}

	//modifiers
   public void shuffle(){
		Collections.shuffle(stackOfCards);

		//shuffle the deck
		//reset variables as needed
	}

   //accessors
	public int size(){
		int size = stackOfCards.size();
		return size;
	}

	public int numCardsLeft(){
		return topCardIndex;
		
	}

	public Card nextCard(){

		if (stackOfCards.size() > 0){
			return stackOfCards.get(topCardIndex--);
		} else {
			shuffle(); //end game?
		}

		return stackOfCards.get(topCardIndex--);
		
	}

	public String toString(){
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}