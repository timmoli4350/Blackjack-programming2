//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<BlackJackCard> stackOfCards;

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
		return 0;
	}

	public Card nextCard(){

		if (stackOfCards.size() > 0){
			return stackOfCards.get(topCardIndex--);
		}
		return 0;
	}

	public String toString(){
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}