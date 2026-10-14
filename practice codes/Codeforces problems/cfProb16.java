import java.util.Scanner;
public class cfProb16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String temp = "";
        for(int i = s2.length()-1; i>=0; i--){
            char c = s2.charAt(i);
            temp += c;
        }
        if(s1.equals(temp)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}