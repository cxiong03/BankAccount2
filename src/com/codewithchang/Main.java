package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Chang", "123456", 5000, "Account");
        CheckingAccount myChecking = new CheckingAccount("Cole", "654321", 2000,300);
        System.out.println(myAccount.toString());
        System.out.println(myChecking.toString());
        myAccount.deposit(500);
        myChecking.deposit(250);
        System.out.println(myAccount.toString());
        System.out.println(myChecking.toString());
        myAccount.withdraw(100000000);
        myChecking.withdraw(5000);
        System.out.println(myAccount.toString());
        System.out.println(myChecking.toString());


    }
}
