import java.util.Scanner;
public class fall24Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = {13,11,19,17,16,15,18,11};
        int k = sc.nextInt();
        double max = 0.0;
        for(int i = 0; i<=marks.length-k; i++){
            double sum = 0.0;
            for(int j = i; j<i+k; j++){
                sum += marks[j];
            }
            if(sum/k > max){
                max = sum/k;
            }
        }
        System.out.println(max);
    }
}