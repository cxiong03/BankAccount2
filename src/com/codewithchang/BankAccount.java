package com.codewithchang;

public class BankAccount {
    private String owner;
    private String acctNum;
    private int balance;
    private String type;

    public BankAccount(String owner, String acctNum, int balance, String type) {
        this.owner = owner;
        this.acctNum = acctNum;
        this.balance = balance;
        this.type = type;
    }

    public void deposit(int amt) {
        if (amt > 0) {
        balance += amt;
        }
    }

    public void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            return;
        }
    }

    @Override
    public String toString() {
        return "Type: " + type + " " + "\tOwner: " + owner + "\tAccount Number: " + acctNum + "\tBalance: " + balance;
        }
    }
