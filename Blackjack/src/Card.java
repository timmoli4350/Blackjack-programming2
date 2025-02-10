//Olivia Timmermann
//Programming II (Wolfe)
//52 cards, blackjack


public class Card {
    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
            "NINE", "TEN", "JACK", "QUEEN", "KING"};

    public static final String SUITS[] = {"Hearts", "Spades", "Diamonds", "Clubs"};

    private String suit; //the type of card
    private int face; //the face value

    //constructors
    public BlackJackCard(int face, String suit) { //pass the card, it prints the face and suits

        face = 
        suit = 
//1-52 are the card numbers, div by 13 for the suit, then mod by 13 for the number
        return "the name" + value;

    }

    public BlackJackCard() { //pass the card, it prints the face and suits

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

        return string;
    }

    
}


//edge cases ace and king