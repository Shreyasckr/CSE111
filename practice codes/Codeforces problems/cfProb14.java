import java.util.Scanner;
public class cfProb14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ln = 0;
        for(long i = n; i>0; i/=10){
            long x = i%10;
            if(x==4 || x==7){
                ln++;
            }
        }
        if(ln==4 || ln==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}