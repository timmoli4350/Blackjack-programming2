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
		
		//loop 1-52 stackOfCards.add(new BlackJackCard) !!!!!!!
        
        for (int i = 0; i <= 52; i++){
			Card newCard = new Card(i);
			stackOfCards.add(newCard);
			System.out.println(newCard);
		}
		
	}

	//modifiers
   public void shuffle(){
		Collections.shuffle(stackOfCards);

		//shuffle the deck
		//reset variables as needed
		//math.random??
	}

   //accessors
	public int size(){
		int size = stackOfCards.size();
		return size;
	}

	public int numCardsLeft(){
		return topCardIndex + 1;
		//every time you shuffle you do a -1
	}

	public Card nextCard(){

		if (stackOfCards.size() > 0){
			return stackOfCards.get(topCardIndex--);
		} else {
			shuffle();
		}

		return stackOfCards.get(topCardIndex--);
		
	}

	public String toString(){
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}