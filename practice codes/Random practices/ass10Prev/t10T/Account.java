public class Account extends Bank {
    public static int cd = 1;
    public int bl = -4;
    public Account() {
        bl = 0;
        br = rs + 3;
        super.bl = 2 + rs + 3;
        rs -= 2;
    }
    public Account(Account acc) {
        bl = acc.bl + super.bl;
        cd = acc.cd;
        acc.withdraw(2, 3);
    }
    public void withdraw(int a, int b) {
        int br = 0;
        br = br + this.br;
        cd = br + 2 + (++rs);
        deposit(cd, br);
        bl = cd + br + bl;
        System.out.println(cd + " " + br + " " + bl);
    }
}