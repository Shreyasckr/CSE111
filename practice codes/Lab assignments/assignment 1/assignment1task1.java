import java.util.Scanner;
public class assignment1task1{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int prime = 0;
        for(int i = n;i<=m;i++){
            int div = 0;
            for(int j =2;j<n;j++){
                if(i%j==0){
                    div++;
                }
            }
            if(div==0){
                prime++;
            }
        }
        System.out.println("There are "+prime+" prime numbers between "+n+" and "+m+".");
    }
}