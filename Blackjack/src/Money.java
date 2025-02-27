//Olivia Timmermann
//Feb 2025

import java.util.Scanner;

public class Money {
    
    public boolean betPlaced;
    private int money;
    private int bet;
    // private boolean gameCurrently;
    Scanner keyboard = new Scanner(System.in);

    
    public void originalMoney() {
        this.money = 300;
    }

    public void originalMoney(int startMoney){
        this.money = startMoney;
    }

    public int getMoney() {
        return money;
    }

    // public Money (int money) {
    //     this.money = money;
    // }

    public boolean placeBet() {

        System.out.println("You have: " + getMoney());
        System.out.println("How much money do you want to bet?");
        bet = keyboard.nextInt(); //takes the next input from keyboard as an integer, sets bet to it.

        if ((money - bet) < 0) {
            System.out.println("insufficient funds, you have " + money);
            System.out.println("place another bet?");

        } else if (bet == 0) {
            System.out.println("you must place a bet to play.");
        }
        
        else {
            money = money - bet;
            System.out.println("You placed a bet of: " + bet +". You now have: " + money);
            return true;
        }

        return false;
    }

    public void winMoney(double profit) {
        money += profit * bet; //profit is the scaling on your bet
    }

    public void tieMoney() { //if you and dealer both get the same
        money += bet; //go back to original money that you had
    }

    //Naturals:
    public void naturalWin(){
        money += bet * 1.5;
    }

    public int getPlayerMoney() {
        return money;
    }

    public int getPlayerBet() {
        return bet;
    }
    
}
