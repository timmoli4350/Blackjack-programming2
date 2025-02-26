//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import java.util.*;

public class Player{
   private ArrayList<Card> hand;
   private int winCount;

   public Player(){
      winCount = 0;
      hand = new ArrayList<Card>();
   }

   public Player(int score){

   }

   public void addCardToHand(Card temp){
      hand.add(temp);
   }

   public void resetHand(){
      hand.clear();
   }

   public void setWinCount(int numwins){
      numwins = winCount;
   }

    public int getWinCount() { 
      return winCount; 
    }

   public int getHandSize() { 
      return hand.size();
    }

   public int getHandValue(){
      int total = 0;
      for (Card card : hand) {
         total += card.getValue();
      }
      System.out.println(total);
      return total;
   }

   public  boolean hit(){
    //ask if they want to hit
      return false;
   }

   public String toString(){
    //loop according to hand size/hand value and print
      return "Player hand size:" + getHandSize() + "Player hand value:" + getHandValue();
   }
}