import java.util.Scanner;
public class cfProb19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int max = 0;
            int maxblack = 0;
            for(int j = 0; j<s.length()-1; j++){
                if(s.charAt(j)=='B' && s.charAt(j)==s.charAt(j+1)){
                    maxblack++;
                    if(maxblack>=max){
                        max = maxblack;
                    }
                }
                else{
                    maxblack = 0;
                }
            }
            if(max>0){
            max++;
            }
            if(max>k){
                System.out.println("0");
            }
            else{
                System.out.println(k-max);
            }
        }
    }
}