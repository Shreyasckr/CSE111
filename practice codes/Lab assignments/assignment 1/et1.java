import java.util.Scanner;
import java.util.Arrays;
public class et1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Remove Element = ");
    int x = sc.nextInt();
    int[] res = new int[n-1];
    int count = 0;
    for(int i = 0; i<n; i++){
      if(arr[i]!=x){
        res[count] = arr[i];
        count++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(res));
  }
}
