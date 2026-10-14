//import java.util.Scanner;
//public class cfProb28{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 0; i<n; i++){
//            int res = 0;
//            int m = sc.nextInt();
//                if(m<3){
//                System.out.println(res);
//            }
//            else{
//                for(int b = 0; b<=m; b++){
//                    for(int a = 0; a<=m; a++){
//                        if(a>0 && b>0 && a+b==m && a>b){
//                            res++;
//                        }
//                    }
//                }
//                System.out.println(res);
//            }
//        }
//    }
//}


import java.util.Scanner;

public class cfProb28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long ans = (n - 1) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}