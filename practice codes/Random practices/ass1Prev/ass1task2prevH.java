import java.util.Scanner;
public class ass1task2prevH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        char ch;
        for(int i = 0 ; i < str.length() ; i++){
            ch = str.charAt(i);
            if(ch == 'a'){
                res += 'z';
            }
            else{
                res += (char)(ch-1);      //******
            }
        }
        System.out.println(res);
    }
}