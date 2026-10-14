import java.util.Scanner;
public class cfProb13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int up = 0;
        int down = 0;
        char c;
        String res = "";
        for(int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                down++;
            }
            else if(c >= 'A' && c <= 'Z'){
                up++;
            }
        }
        if(down>=up){
            res = s.toLowerCase();
        }
        else{
            res = s.toUpperCase();
        }
        System.out.println(res);
    }
}