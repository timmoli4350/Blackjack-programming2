//Olivia Timmermann
//Programming II (Wolfe)
//52 cards, blackjack


public class Card extends Player {
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
        cardNum = num-1;
        face = cardNum % 13 + 1;
        suit = cardNum / 13;

        if (face == 0) { //increments down to a lower suit
            face = 13;
            suit = suit - 1;
        }

        
    }


    //1-52 are the card numbers, div by 13 for the suit, then mod by 13 for the number

    public void setFace(int face) {
    }

    public void setSuit(int suit) {

    }

    //accessors
    public int getValue(){
        if (face >= 11){
            return 10;
        }
//--------------------------------------------------- aces
        if (face == 1){ 
            if (getHandValue() + 11 < 21) {
                return 11;
            } else {
                return 1;
            }
   
        }
//---------------------------------------------------
        return face;
    }

    public int testSuit(){
        return suit;
    }

    public String getSuit(){
        return SUITS[suit]; //returns the index of the suit in the array
    }

    public String getFace(){
        return FACES[face]; //returns the index of the face in the array
    }


    public boolean equals(Object obj){
      return false;
    }

    //toString

    public String toString(){

        return FACES[face] + " of " + getSuit() + " | value = " + getValue();
    }

    
}

