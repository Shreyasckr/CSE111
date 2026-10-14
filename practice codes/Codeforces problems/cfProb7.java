import java.util.Scanner;
public class cfProb7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        char ch;
        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            boolean found = false;
            for(int j = 0; j<res.length(); j++){
                if(ch == res.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                res += ch;
            }
        }
        if(res.length()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
