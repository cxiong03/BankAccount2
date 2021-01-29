package Bank;

import Account.Account;
import Account.CheckingAccount;
import Account.SavingAccount;
import BankTools.DebitCard;
import BankTools.Generator;
import BankTools.Ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank {
    private String name;
    private int onHandCash;
    private String city;
    private HashMap<Integer, Client> clients = new HashMap<Integer, Client>();
    private HashMap<String, Account> accounts = new HashMap<String, Account>();
//    private List<Account> accounts = new ArrayList<Account>();
    private int accountCount = 0;
    private int clientCount = 0;
    final private String NUMBERS = "0123456789";
//    list of accounts?

    // create the bank.
    public Bank(String name, String city) {
        this.name = name;
        this.city = city;
        this.onHandCash = 100000000;
    }
    // add client
    public void addClient(String firstName, String lastName, String ssn, String address) {
        Client newClient = createClient(firstName, lastName, ssn, address);
        clients.put(newClient.getClientID(), newClient);
    }
    // Overload method
    public void addClient(String firstName, String lastName, String ssn) {
        Client newClient = createClient(firstName, lastName, ssn, this.city);
        clients.put(newClient.getClientID(), newClient);
    }

    private Client createClient(String firstName, String lastName, String ssn, String address) {
        return new Client(firstName, lastName, ssn, address, ++clientCount);
    }
    // display clients
    public String displayClients() {
        String output = name + "clients:\n";
        //logic
        for (var client : clients.values()) {
            output += client.getName() + "\n" + client.displayAccounts() + "\n";
        }
        return output;
    }

    // Add account to client
    public void addAccount(int balance, int ownerId, String accountType, Ui ui) {
        Client client = clients.get(ownerId);
        Account newAccount = createAccount(balance, client.getName(), accountType, ui);
        accounts.put(newAccount.getAccountNum(), newAccount);
        client.addAccount(newAccount);
    }

    // Create Account
    private Account createAccount(int balance, String owner, String accountType, Ui ui) {
        switch (accountType) {
            case "checking":
                return new CheckingAccount(
                        owner,
                        Integer.toString(++accountCount),
                        balance,
                        ui.getNumber("What is this clients Daily limit? " + 20 + " - " + balance,
                                20, balance)
                );
            case "savings":
                return new SavingAccount(
                        owner,
                        Integer.toString(++accountCount),
                        balance,
                        ui.getNumber("Savings Interest rate 3% to 10%? ", 3, 10)
                );
            default:
                System.out.println("ERROR: Invalid Account Type");
                return null;
        }
    }

    public void addDebitCard(int ownerId, String accountId) {
        Client client = clients.get(ownerId);
        Account account = accounts.get(accountId);
        if (!(account instanceof CheckingAccount)) {
            System.out.println("Error: Primary account must be a checking account.");
            return;
        }
        DebitCard newCard = createDebitCard(client.getName(), (CheckingAccount) account);
        client.addDebitCard(newCard);
    }

    public DebitCard createDebitCard(String owner, CheckingAccount account) {
        String cardNum = Generator.randomCode(NUMBERS, 16);
        String pin = Generator.randomCode(NUMBERS, 4);
        String securityCode = Generator.randomCode(NUMBERS, 3);

        return new DebitCard(cardNum, pin, securityCode, owner, account);
    }

    // Close Account
}
