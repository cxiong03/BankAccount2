package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount(String owner, String acctNum, int balance, int investment) {
        super(owner, acctNum, balance, "Investment");
        this.investment = investment;
    }

    public InvestmentAccount(String owner, String acctNum, int balance, int investment, String type) {
        super(owner, acctNum, balance, type);
        this.investment = investment;
    }

    public void applyInvestment() {
        int appliedInvestment = (int) (balance * (investment / 100.0));
        balance += appliedInvestment;
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt + 1000);
    }
}
