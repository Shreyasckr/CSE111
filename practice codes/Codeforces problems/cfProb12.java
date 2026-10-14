import java.util.Scanner;
public class cfProb12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= w; i++){
            sum += (i*k);
        }
        int need = sum - n;
        if(need>0){
            System.out.println((need));
        }
        else{
            System.out.println("0");
        }
    }
}