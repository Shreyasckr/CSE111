import java.util.Scanner;
public class cfProb9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Limak = sc.nextInt();
        int Bob = sc.nextInt();
        int years = 0;
        int i = 0;
        while(Bob>=Limak){
            Bob *= 2;
            Limak *= 3;
            i++;
        }
        System.out.println(i);
    }
} 