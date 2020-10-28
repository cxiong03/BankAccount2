package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount(String owner, String acctNum, int balance, int investment) {
        super(owner, acctNum, balance, "Investment");
        this.investment = investment;
    }

    public void applyInvestment() {
        int appliedInvestment = balance * (investment / 100);
    }
}
