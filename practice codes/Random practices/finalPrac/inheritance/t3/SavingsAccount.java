public class SavingsAccount extends BankAccount{
    public double interestRate ;
    
    public SavingsAccount(String s, int n, double d){
        super(s, n);
        interestRate  = d;
    }
}