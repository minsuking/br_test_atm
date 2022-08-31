
public class Atm {
    private Bank bank;
    private int cardNum;
    private int pinNum;

    /*
       Get bank information and run the ATM
     */
    public Atm(Bank bank){
        this.bank = bank;
    }
    /*
       true  : valid card
       false : invalid card
     */
    public Boolean insert(int cardNum, int pinNum){
        if(this.bank.checkPin(cardNum, pinNum)!=null){
            this.cardNum = cardNum;
            this.pinNum = pinNum;
            return true;
        }
        return false;
    }
    /*
        The reason for returning this function to String Type is to send an error message
        (assuming that there is no -1$)
     */
    public String balance(){
        int money = this.bank.checkBalance(this.cardNum, this.pinNum);
        if(money == -1){
            return "error";
        }else{
            return "Balace :" + money;
        }
    }

    public Boolean withdraw(int num){
        return this.bank.withdraw(this.cardNum, this.pinNum, num);
    }

    public Boolean deposit(int num){
        return this.bank.deposit(this.cardNum, this.pinNum, num);
    }


}
