package com.codewithchang;

import Account.BankAccount;
import Account.CheckingAccount;
import Account.SavingAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Chang", "123456", 5000, "Account");
        CheckingAccount myChecking = new CheckingAccount("Cole", "654321", 2000,300);
        SavingAccount mySavings = new SavingAccount("Will", "3333", 800, 5);
        System.out.println(myAccount.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings.toString());
        myAccount.deposit(500);
        myChecking.deposit(250);
        mySavings.deposit(100);
        System.out.println(myAccount.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings.toString());
        myAccount.withdraw(100000000);
        myChecking.withdraw(5000);
        mySavings.withdraw(600);

        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);

//        System.out.println(myAccount.toString());
//        System.out.println(myChecking.toString());
    }
}
