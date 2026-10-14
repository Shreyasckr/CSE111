public class FixedDeposit extends SavingsAccount{
    public int months;
    
    public FixedDeposit(String s, int n, double d, int m){
        super(s, n, d);
        months = m;
    }
    public double maturityAmount(){
        return balance+balance*(interestRate/100.0);
    }
}