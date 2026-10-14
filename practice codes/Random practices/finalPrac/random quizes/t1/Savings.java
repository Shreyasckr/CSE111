public class Savings extends Account{
    public double rate;
    public int min;
    
    public Savings(String s1, String s2, int n, double d, int m){
        super(s2, n);
        accountType = s1;
        rate = d;
        min = m;
    }
    
    public void deposit(int n){
        balance += n;
        System.out.println("Deposited $"+(double)n+". New Balance: $"+balance);
    }
    
    public void withdraw(int n){
        if(balance-n<500){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= n;
            System.out.println("Withdrew $"+(double)n+". New Balance: $"+balance);
        }
    }
    
    public void applyInterest(){
        double x = balance*rate;
        balance += x;
        System.out.println("Applied interest: $"+x+". New Balance: $"+balance);
    }
    
    public String toString(){
        return super.toString()+"Interest Rate: "+rate+", Minimum Balance: $"+(double)min;
    }
}