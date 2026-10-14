import java.util.Scanner;
public class assignment1task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] counted = new boolean[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(counted[i]){
                continue;
            }
            else{
                int count = 1;
                for(int j = i + 1; j<n; j++){
                    if(arr[i] == arr[j]) {
                        counted[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " - " + count + " times");
            }
        }
    }
}