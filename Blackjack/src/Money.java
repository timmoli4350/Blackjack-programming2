//Olivia Timmermann
//Feb 2025

public class Money {
    
    int money;
    int bet;

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
}
