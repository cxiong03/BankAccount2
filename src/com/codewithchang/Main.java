package com.codewithchang;

import Account.*;
import Bank.Bank;
import Bank.Client;
import BankTools.Console;
import BankTools.DebitCard;
import BankTools.Ui;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Ui console = new Console();
        Bank ourBank = new Bank("Cliff Trust", "GoodTown");
        ourBank.addClient("Chang", "Xiong", "3333");

        ourBank.addAccount(10000, 1, "checking", console);

        System.out.println(ourBank.displayClients());
    }
}
