package com.codewithchang;

import Account.*;
import Bank.Client;
import BankTools.DebitCard;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("Chang", "123456", 5000, "Account");
        CheckingAccount myChecking = new CheckingAccount("Cole", "654321", 2000,300);
        SavingAccount mySavings = new SavingAccount("Will", "3333", 800, 5);
        InvestmentAccount myInvest = new InvestmentAccount("Chang", "3289", 100000, 3);
        CDInvestment myCD = new CDInvestment("Chelsea", "7845", 300000, 36);

        Client janet = new Client("Janet", "Cruz", "1234566", "Detroit");

        janet.addAccount(mySavings);
        janet.addAccount(myCD);
        janet.addAccount(myChecking);
        janet.addAccount(myInvest);
        janet.displayAccounts();
        janet.addDebitCard("654321");

        System.out.println(janet);

        DebitCard myCard = new DebitCard("12345678", "3241", "099", "Amber", myChecking);
        myCard.addAccount(mySavings);
        myCard.addAccount(myInvest);
        myCard.addAccount(myCD);
        myCard.displayAccounts();
        myCard.details();
    }
}
