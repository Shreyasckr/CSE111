public class AccountTester {
    public static void main(String[] args) {
        Savings s1 = new Savings("Savings", "SA123", 1000, 0.05, 500);
        System.out.println(s1);
        System.out.println("-----------1------------");
        s1.deposit(400);
        System.out.println("-----------2------------");
        s1.withdraw(1000);
        System.out.println("-----------3------------");
        s1.withdraw(800);
        System.out.println("-----------4------------");
        s1.applyInterest();
        System.out.println("-----------5------------");
        System.out.println(s1);
    }
}