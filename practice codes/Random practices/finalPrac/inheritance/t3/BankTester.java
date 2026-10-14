public class BankTester {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Reza", 5000, 3.5);
        FixedDeposit f = new FixedDeposit("Mina", 20000, 7.0, 12);
        System.out.println(s.summary());
        System.out.println("Rate: " + s.interestRate + "%");
        System.out.println("---");
        System.out.println(f.summary());
        System.out.println("Rate: " + f.interestRate + "% | Months: " + f.months);
        System.out.println("Maturity: " + f.maturityAmount());
    }
}

//Owner: Reza | Bal: 5000.0
//Rate: 3.5%
//---
//Owner: Mina | Bal: 20000.0
//Rate: 7.0% | Months: 12
//Maturity: 21400.0