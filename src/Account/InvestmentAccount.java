package Account;

public class InvestmentAccount extends BankAccount implements Account {
    private int investment;
    private int period = 3;

    public InvestmentAccount(String owner, String accountNum, int balance, int investment) {
        super(owner, accountNum, balance, "Investment");
        this.investment = investment;
    }

    public InvestmentAccount(String owner, String accountNum, int balance, int investment, String type) {
        super(owner, accountNum, balance, type);
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
