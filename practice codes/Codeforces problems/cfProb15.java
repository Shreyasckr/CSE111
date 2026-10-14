import java.util.Scanner;
public class cfProb15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int anton = 0;
        int danik = 0;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='A'){
                anton++;
            }
            else{
                danik++;
            }
        }
        if(anton==danik){
            System.out.println("Friendship");
        }
        else if(anton>danik){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
}