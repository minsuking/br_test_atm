package Account;

public class Account {
    private int cardNum;
    private int pinNum;
    private int money;
    public Account(int cardNum, int pinNum, int money){
        this.cardNum = cardNum;
        this.pinNum = pinNum;
        this.money = money;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNum=" + cardNum +
                ", pinNum=" + pinNum +
                ", money=" + money +
                '}';
    }
}
