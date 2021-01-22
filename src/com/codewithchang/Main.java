package com.codewithchang;

import Account.*;
import Bank.Bank;
import Bank.Client;
import BankTools.DebitCard;

public class Main {

    public static void main(String[] args) {

        Client chang = new Client("Chang", "Xiong", "333", "1 Providence");

        Bank ourBank = new Bank("Bit Credit Union", "Circuit Island");

        ourBank.addClient("Chang", "Xiong", "333", "1 Providence");
        ourBank.addClient("Jim", "Brown", "1445");
    }
}
