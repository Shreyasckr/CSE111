import java.util.Scanner;
public class cfProb6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int result = s1.compareTo(s2);
        if (result < 0) {
            System.out.println("-1");
        } 
        else if (result > 0) {
            System.out.println("1");
        } 
        else {
            System.out.println("0");
        }
    }
}



//import java.util.Scanner;
//public class cfProb6{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine().toLowerCase();
//        String s2 = sc.nextLine().toLowerCase();
//        char ch;
//        int sum1 = 0;
//        int sum2 = 0;
//        for(int i = 0; i < s1.length(); i++){
//            ch = s1.charAt(i);
//            sum1 += ch;
//            ch = s2.charAt(i);
//            sum2 += ch;
//        }
//        if(sum1 == sum2){
//            System.out.println("0");
//        }
//        else if(sum1 > sum2){
//            System.out.println("1");
//        }
//        else{
//            System.out.println("-1");
//        }
//    }
//}