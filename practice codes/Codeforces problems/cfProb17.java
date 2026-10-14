import java.util.Scanner;
public class cfProb17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 1;
        boolean dan = false;
        for(int i = 0; i<s.length()-1; i++){
            char c = s.charAt(i);
            if(c==s.charAt(i+1)){
                max++;
                if(max>=7){
                    dan = true;
                }
            }
            else{
                max = 1;
            }
        }
        if(dan){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
