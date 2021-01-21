package com.codewithchang;

import Account.*;
import Bank.Client;
import BankTools.DebitCard;

public class Main {

    public static void main(String[] args) {

        Client chang = new Client("Chang", "Xiong", "333", "1 Providence");

        chang.addAccount(new CheckingAccount("Chang", "1234", 1000, 500));
        chang.addAccount(new SavingAccount("Leon", "5543", 3000, 5));
        chang.addAccount(new InvestmentAccount());
    }
}
