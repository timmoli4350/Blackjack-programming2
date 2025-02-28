//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Olivia Timmermann
//Date - Feb 2025

import java.util.*;

public class Player{
   private ArrayList<Card> hand;
   public int winCount;
   Scanner keyboard = new Scanner(System.in);

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
      //System.out.println(total);
      return total;
   }

   public boolean hit(){
      System.out.println("Do you want to hit? (y/n)");

      String response = keyboard.next();

      if (response.charAt(0) == 'y'){
         return true;
      } else {
         return false;
      }
   }

   public void printRules(){
      System.out.println("Olivia's Blackjack:");
      System.out.println("Each player is dealt two cards, including the dealer.");
      System.out.println("Each round, you can choose to hit (get another card), or stand (keep your current cards)");
      System.out.println("All face cards are worth 10 points.");


      System.out.println("Winning:");
      System.out.println("You want to get as close as possible to 21 without going over (busting)");
      System.out.println("The dealer is forced to 'hit' if their card value is under 17.");
      System.out.println("If the dealer busts, and you don't, you win.");
      System.out.println("However, if the dealer is > 17 and < 22, and you stand with a lower value, you lose.");
      System.out.println("If you bust, you also lose.");

      System.out.println("Scoring:");
      System.out.println("Loss: You lose the bet you placed.");
      System.out.println("Tie: You just recieve back your original bet.");
      System.out.println("Natural Win: You recieve 1.5 times the bet you placed.");
      System.out.println("Win: You recieve 2 times the bet you placed.");

      System.out.println("Have fun!");
   }



   public String toString(){
    //loop according to hand size/hand value and print
      for (Card card : hand) {
         System.out.println(card.toString());
      }
    
      return ">>> Hand size: " + getHandSize() + " || Hand value: " + getHandValue() + " <<< ";


   }
}