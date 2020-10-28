package Account;

public class CheckingAccount extends BankAccount {
    private  int dailyLimit;
    private int dailyWithdrawn = 0;

    public CheckingAccount(String owner, String acctNum, int balance, int dailyLimit) {
        super(owner, acctNum, balance, "Checking");
        this.dailyLimit = dailyLimit;
    }

    public void resetDailyWithdrawn() {
        dailyWithdrawn = 0;
    }

    @Override
    public void withdraw(int amt) {
        if (dailyWithdrawn + amt > dailyLimit) {
            System.out.println("Error over limit.");
            return;
        }
        super.withdraw(amt);
    }
}
