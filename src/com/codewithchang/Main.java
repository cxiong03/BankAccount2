package com.codewithchang;

import Account.*;
import BankTools.DebitCard;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("Chang", "123456", 5000, "Account");
        CheckingAccount myChecking = new CheckingAccount("Cole", "654321", 2000,300);
        SavingAccount mySavings = new SavingAccount("Will", "3333", 800, 5);
        InvestmentAccount myInvest = new InvestmentAccount("Chang", "3289", 100000, 3);
        CDInvestment myCD = new CDInvestment("Chelsea", "7845", 300000, 36);

        DebitCard myCard = new DebitCard("12345678", "3241", "099", "Amber", myChecking);
        myCard.addAccount(mySavings);
        myCard.addAccount(myInvest);
        myCard.addAccount(myCD);
        myCard.displayAccounts();
        myCard.details();
    }
}
