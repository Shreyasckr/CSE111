import java.util.Scanner;
public class cfProb32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int z = 1; z<=k; z++){
            int n = sc.nextInt();
            int[] s = new int[n];
            int x = sc.nextInt();
            boolean button = false;
            for(int i = 0; i<n; i++){
                s[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++){
                if(s[i] == 1){
                    if(!button){
                        for(int j = i; j<i+x && j<n; j++){
                            s[j] = 0;
                            button = true;
                        }
                    }
                }
            }
            boolean found = false;
            for(int i = 0; i<n; i++){
                if(s[i] == 1){
                    found = true;
                }
            }
            if(found){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}