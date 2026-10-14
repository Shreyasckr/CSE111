import java.util.Scanner;
public class cfprob35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int k = 0; k<n; k++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            boolean found = false;
            for(long i = x; i<y; i++){
                if(i%x==0 && i>x && i<y && y%i!=0){
                    found = true;
                }
            }
            if(found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}