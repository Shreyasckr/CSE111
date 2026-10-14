import java.util.Scanner;

public class Smallest01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; ; i++) {
            if (isOnly01(i)) {
                if (i % n == 0) {
                    System.out.println("Smallest number with 0s and 1s divisible by " + n + " is: " + i);
                    break;
                }
            }
        }
    }
    public static boolean isOnly01(int num) {
        String s = Integer.toString(num);
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}