package Account;

public class CDInvestment extends InvestmentAccount{
    private int timeFrame;

    public CDInvestment(String owner, String acctNum, int balance, int timeFrame) {
        super(owner, acctNum, balance, 5, "Certificate of Deposit");
        this.timeFrame = timeFrame;
    }
    // TODO: getTimeFrame;

    public void checkIfInterest(int time) {
        if(time <= timeFrame && balance > 0) {
            applyInvestment();
        }
    }

    @Override
    public void withdraw(int amt) {
        return;
    }

}
