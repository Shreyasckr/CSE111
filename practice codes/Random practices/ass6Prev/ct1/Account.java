public class Account{
    public String name;
    public String address;
    private double balance = 0.0;
    
    public static String bankName = "Badda Bank";
    public static int count = 0;
    public static double totalBalance = 0.0;
    
    public void setBalance(int n){
        balance += n;
        totalBalance += n;
    }
    public double getBalance(){
        return balance;
    }
    
    public Account(String s1, String s2){
        name = s1;
        address = s2;
        count++;
    }
    
    public void printInfo(){
        System.out.println("Name: "+name+", address: "+address+" Balance: "+getBalance()+" Taka");
    }
}