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
		topCardIndex = NUMCARDS;
		stackOfCards = new ArrayList<>();
        
        for (int i = 0; i < NUMCARDS; i++){
			BlackJackCard newCard = new BlackJackCard(i);
			stackOfCards.add(newCard);
			//System.out.println(newCard);
		}
		shuffle();
	}

	//modifiers
   public void shuffle(){
		Collections.shuffle(stackOfCards);
		topCardIndex = NUMCARDS - 1;

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
		// if (topCardIndex > 0){
		//  	return stackOfCards.get(topCardIndex--); //run shuffle when you begin a new round

		// return 0;
		return stackOfCards.get(topCardIndex--);
	}
	

	public String toString(){
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 

}