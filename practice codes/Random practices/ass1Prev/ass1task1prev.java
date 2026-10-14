import java.util.Scanner;
public class ass1task1prev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum  = 0;  
        double avg = 0;
        int max = 0;
        int min = 0;
        double odd = 0.0;
        for(int i = 0;i<10;i++){
            int n = sc.nextInt();
            if(i==0){
                max = n;
                min = n;
            }
            if(n>0 && n%2!=0){
                if(n>max){
                    max = n;
                }
                if(n<min){
                    min  = n;
                }
                sum += n;
                odd++;
            }
        }
        if(odd == 0){
            System.out.println("No odd positive numbers found");
        }
        else{
            System.out.println(sum);
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum/odd);
        }
    }
}