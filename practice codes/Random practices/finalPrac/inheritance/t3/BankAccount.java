public class BankAccount {
    public double balance;
    public String owner;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public String summary() {
        return "Owner: " + owner + " | Bal: " + balance;
    }
}