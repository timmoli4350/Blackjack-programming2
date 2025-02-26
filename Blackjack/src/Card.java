//Olivia Timmermann
//Programming II (Wolfe)
//52 cards, blackjack


public class Card {
    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
            "NINE", "TEN", "JACK", "QUEEN", "KING"};

    public static final String SUITS[] = {"Hearts", "Spades", "Diamonds", "Clubs"};

    private int cardNum;
    private int suit; //the type of card
    public int face; //the face value 1-13

    public int blackjackFaceIndex;


    //constructors

    public Card() { //default constructor
        cardNum = 0;
        face = (cardNum) % 13;
        suit = ((cardNum) / 13);
    }

    public Card(int num) { //input a number
        cardNum = num;
        face = cardNum % 13;
        suit = cardNum / 13;

        if (face == 0) {
            face = 13;
            suit = suit - 1;
        }

        
    }


    //1-52 are the card numbers, div by 13 for the suit, then mod by 13 for the number

    public void setFace(int face) {
        face = 0;
    }

    public void setSuit(int suit) {

    }

    //accessors
    public int getValue(){
        return face;
    }

    public String getSuit(){
        return SUITS[suit]; //returns the index of the suit in the array
    }


    public boolean equals(Object obj){
      return false;
    }

    //toString

    public String toString(){

        return FACES[face] + " of " + getSuit() + " | value = " + getValue();
    }

    
}


//edge cases ace and king