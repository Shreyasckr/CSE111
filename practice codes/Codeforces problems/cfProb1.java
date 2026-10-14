import java.util.Scanner;
public class cfProb1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean div = false;
        for(int i = 1;i<n;i++){
            if(i%2==0 && (n-i)%2==0){
                div = true;
                break;
            }
        }
        if(div){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}