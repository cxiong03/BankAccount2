package Account;

public class CDInvestment extends InvestmentAccount{
    private char timePeriod = 'M';

    public CDInvestment(String owner, String acctNum, int balance, int investment) {
        super(owner, acctNum, balance, investment);
    }
}
