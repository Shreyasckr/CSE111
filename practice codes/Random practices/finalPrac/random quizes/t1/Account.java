public class Account {
    private String accountNumber;
    protected double balance;
    protected String accountType;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = "General";
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited $%.2f. New Balance: $%.2f\n", amount, balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. New Balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public String toString() {
        String s = "Account Type: " + accountType + "\n";
        s +="Account Number: " + accountNumber + ", Balance: $" + String.format("%.2f", balance) + "\n";
        return s;
    }
}
