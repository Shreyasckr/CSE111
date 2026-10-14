import java.util.Scanner;
public class cfProb3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ques = 0;
        for(int i = 1;i<=n;i++){
            int canDo = 0;
            for(int j = 1;j<=3;j++){
                int x = sc.nextInt();
                if(x==1){
                    canDo++;
                }
            }
            if(canDo>=2){
                ques++;
            }
        }
        System.out.println(ques);
    }
}