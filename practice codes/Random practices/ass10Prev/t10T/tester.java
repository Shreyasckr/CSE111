public class tester{
    public static void main(String[] args){
        Bank b1 = new Bank();
        Account a1 = new Account();
        Account a2 = new Account(a1);
        a1.deposit(3, 4);
        a2.withdraw(1, 6);
    }
}