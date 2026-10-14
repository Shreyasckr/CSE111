import java.util.Scanner;
public class cfProb33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int un = 0;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += sc.nextInt();
            if(sum<0){
                un++;
                sum = 0;
            }
        }
        System.out.println(un);
    }
}