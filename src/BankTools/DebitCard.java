package BankTools;

import Account.Account;
import Account.CheckingAccount;
import Account.InvestmentAccount;
import Account.SavingAccount;

import java.util.ArrayList;
import java.util.List;

// COMPOSITION - A DEBIT CARD HAS A CHECKING ACCOUNT
public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNum;
    private String pin;
    // private Calendar expDate;
    private String cardOwner;
    private List<Account> atmAccounts = new ArrayList<>();

    public DebitCard(String cardNum, String pin, String securityCode, String cardOwner, CheckingAccount primary) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.securityCode = securityCode;
        this.cardOwner = cardOwner;
        this.primary = primary;
    }

    public void addAccount(Account account) {
        atmAccounts.add(account);
    }

    public boolean charge(int amt, String pin) {
        if(this.pin.equals(pin) && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

    public void displayAccounts() {
        for (var account : atmAccounts) {
            System.out.println(account.toString());
        }
    }

    public String details() {
        return "Owner: " + cardOwner + "\tAccount Balance: " + primary.getBalance();
    }
}
