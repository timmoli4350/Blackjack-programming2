//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb. 2025


public class BlackJackCard extends Card{
  	//constructors
	int blackjackFaceIndex;

    public BlackJackCard(int cardNum) {
		super(cardNum);
		this.blackjackFaceIndex = super.blackjackFaceIndex;
    }

  	public int getValue()
  	{
		return face;
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
  	}
  	
 }