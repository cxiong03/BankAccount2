package Account;

public class SavingAccount extends BankAccount implements Account {
    private int interest;

    public SavingAccount(String owner, String accountNum, int balance, int interest) {
        super(owner, accountNum, balance, "Savings");
        this.interest = interest;
    }

    public void applyInterest() {
//        int amount = (int) (balance * (interest / 100.0));
        balance += (int) (balance * (interest / 100.0));
    }

    @Override
    public String toString() {
        return super.toString() + "\tInterest: " + interest + "%";
    }
}
