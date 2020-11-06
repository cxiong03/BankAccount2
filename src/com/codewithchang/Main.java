package com.codewithchang;

import Account.*;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("Chang", "123456", 5000, "Account");
//        CheckingAccount myChecking = new CheckingAccount("Cole", "654321", 2000,300);
//        SavingAccount mySavings = new SavingAccount("Will", "3333", 800, 5);
        InvestmentAccount myInvest = new InvestmentAccount("Chang", "3289", 100000, 3);
        CDInvestment myCD = new CDInvestment("Chelsea", "7845", 300000, 36);
        System.out.println(myInvest);
        System.out.println(myCD);
        myInvest.applyInvestment();
        myCD.checkIfInterest(4);
        System.out.println(myCD);
        myCD.checkIfInterest(36);
        System.out.println(myCD);
        System.out.println(myInvest);

    }
}
