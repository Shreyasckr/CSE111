public class Bank {
    public static int rs = 3;
    public static int cd = -8;
    public int bl = 0;
    public int br = 0;
    public Bank() {
        br = rs - 2;
        bl = rs + 1;
        rs -= 2;
    }
    public void deposit(int a, int b) {
        int cd = 0;
        br = br + a + (rs++);
        cd = cd + 1 + b;
        bl = bl + cd + br;
        System.out.println(cd + " " + br + " " + bl);
    }
}