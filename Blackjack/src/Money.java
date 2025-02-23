//Olivia Timmermann
//Feb 2025

public class Money {
    
    private int money;
    private int bet;
    private boolean gameCurrently;

    /*
     * while (placeBet == false) {
     * placeBet();
     * }
     * 
     */
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

    public boolean placeBet(int myBet) {
        this.bet = myBet;

        if ((money - bet) < 0) {

            System.out.println("insufficient funds, you have " + money);
            System.out.println("place another bet?");

        } else {
            money = money - myBet;
            return true;

        }

        return false;
    }

    public void winMoney(double profit) {
        money += profit * bet; //profit is the scaling on your bet
    }

    public void tieMoney() {
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
