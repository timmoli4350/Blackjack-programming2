//Olivia Timmermann
//Programming II (Wolfe)
//52 cards, blackjack


public class Card {
    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
            "NINE", "TEN", "JACK", "QUEEN", "KING"};

    public static final String SUITS[] = {"Hearts", "Spades", "Diamonds", "Clubs"};

    private String suit; //the type of card
    private int face; //the face value 1-13

    //constructors
    //1-52 are the card numbers, div by 13 for the suit, then mod by 13 for the number

    public void BlackJackCard(int face, String suit) { //pass the card, it prints the face and suits

        face = ;
        suit = ;
        return "the name" + value;

    }

    public void BlackJackCard() { //pass the card, it prints the face and suits

        
        return ?;

    }

    //default constructor: nothing passed


    //modifiers 
    /* 

    face = 0;
    suit = num/13;
*/

    //accessors
    public int getValue(){
        return face;
    }

    public String getSuit(){
        return SUITS[face];
    }


    public boolean equals(Object obj){
      return false;
    }

    //toString

    public String toString(){

        return FACES[face] + "of" + getSuit() + "| value =" + getValue();
    }

    
}


//edge cases ace and king