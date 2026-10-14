import java.util.Scanner;
public class cfProb29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x = 0; x<n; x++){
            int s = sc.nextInt();
            int temp  = s;
            int bal = 0;
            int digit = 0;
            while(temp > 0){
                if(temp % 10 != 0){
                    bal++;
                }
                temp /= 10;
                digit++;
            }
            System.out.println(bal);  
            int d = 1;
            for(int i = 1; i<=digit; i++){
                int res = (s%10);
                if(res != 0){
                    System.out.print(res*d+" ");
                }
                s /= 10;
                d *= 10;
            }
            System.out.println();
        }
    }
}