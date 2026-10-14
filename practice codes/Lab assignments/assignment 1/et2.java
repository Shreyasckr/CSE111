import java.util.Scanner;
public class et2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int max = Integer.MIN_VALUE;
    int maxIdx = 0;
    int min = Integer.MAX_VALUE;
    int minIdx = 0;
    for(int i = 0; i<5; i++){
      arr[i] = sc.nextInt();
      if(arr[i]>max){
        max = arr[i];
        maxIdx = i;
      }
      if(arr[i]<min){
        min = arr[i];
        minIdx = i;
      }
    }
    System.out.println("The largest number "+max+" was found at location "+maxIdx);
    System.out.println("The smallest number "+min+" was found at location "+minIdx);
  }
}
