//Olivia Timmermann
//Programming II (Wolfe)

import static java.lang.System.*;
import java.awt.Color;

public class CardTestOne{
	public static void main( String args[] ){
		Card one = new Card(1);
		System.out.println(one);

		Card one = new Card(12);
		System.out.println(one);

		Card one = new Card(13);
		System.out.println(one);

	Card one = new Card(14); //ace of spades
		System.out.println(one);

		Card one = new Card(51); //queen of clubs
		System.out.println(one);

		Card one = new Card(52); //king of clubs
		System.out.println(one);

		/* 
		Card two = new BlackJackCard(1,"DIAMONDS");
		out.println(two);

		Card three = new BlackJackCard(4,"CLUBS");
		out.println(three);
		
		Card four = new BlackJackCard(12,"SPADES");
		out.println(four);
	
		Card five = new BlackJackCard(12,"HEARTS");
		out.println(five);	
		
		Card six = new BlackJackCard(9,"SPADES");
		out.println(six);				

		out.println(one.equals(two));
		out.println(one.equals(one));		
		out.println(four.equals(five));	
		out.println(three.equals(four));		
		*/				
	}
}