//Olivia Timmermann
//Programming II (Wolfe)

import static java.lang.System.*;
import java.awt.Color;

public class CardTestOne{
	public static void main( String args[] ){
		Card one = new Card(1);
		System.out.println(one);

		Card two = new Card(13);
		System.out.println(two);

		Card three = new Card(43);
		System.out.println(three);

		Card four = new Card(14); //ace of spades
		System.out.println(four);

		Card five = new Card(51); //queen of clubs
		System.out.println(five);

		Card six = new Card(52); //king of clubs
		System.out.println(six);

	}
}