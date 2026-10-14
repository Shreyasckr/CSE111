import java.util.Scanner;
public class cfProb4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(arr[i]>0 && arr[i]>=arr[k-1]){
                res++;
            }
        }
        System.out.println(res);
    }
}