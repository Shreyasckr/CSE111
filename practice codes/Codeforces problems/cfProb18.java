import java.util.Scanner;
public class cfProb18{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            if(x<=h){
                width++;
            }
            else if(x>h){
                width += 2;
            }
        }
        System.out.println(width);
    }
}