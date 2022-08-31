import Account.Account;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank {

    private Map<Integer, Account> accounts;

    public Bank(){
        this.accounts  = new HashMap<>();
    }

    public String addAccount(int pin, int deposit){
        Account account;
        while(true) {
            int cardNum = (int) (Math.random() * 10000);

            if (accounts.containsKey(cardNum) != true) {
                account = new Account(cardNum, pin, deposit);
                this.accounts.put(cardNum, account);
                break;
            }
        }
        return account.toString();

    }

    public Account checkPin(int cardNum, int pinNum) {
        for(Account acc : this.accounts.values()){
            if(acc.getPinNum() == pinNum && acc.getCardNum() == cardNum){
                return acc;
            }
        }
        return null;
    }

    public int checkBalance(int cardNum, int pinNum) {
        Account acc = checkPin(cardNum, pinNum);
        if(acc != null){
            return acc.getMoney();
        }
        return -1;
    }

    public Boolean withdraw(int cardNum, int pinNum, int num) {
        Account acc = checkPin(cardNum, pinNum);
        if(acc != null){
            if(acc.getMoney() > num){
                acc.setMoney(acc.getMoney() - num);
                return true;
            }
        }
        return false;
    }

    public Boolean deposit(int cardNum, int pinNum, int num) {
        Account acc = checkPin(cardNum, pinNum);
        if(acc != null) {
            acc.setMoney(acc.getMoney() + num);
            return true;
        }
        return false;
    }
}
