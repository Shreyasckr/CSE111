import java.util.Scanner;
import java.util.Arrays;
public class et4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n/2; i++){
      int temp = arr[n-1-i];
      arr[n-1-i] = arr[i];
      arr[i] =  temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
