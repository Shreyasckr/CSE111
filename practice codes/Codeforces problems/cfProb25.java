import java.util.Scanner;
public class cfProb25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bill = 0;
        while(n>=100){
            n -= 100;
            bill++;
        }
        while(n>=20){
            n -= 20;
            bill++;
        }
        while(n>=10){
            n -= 10;
            bill++;
        }
        while(n>=5){
            n -= 5;
            bill++;
        }
        while(n>=1){
            n -= 1;
            bill++;
        }
        System.out.println(bill);
    }
}