//import java.util.Scanner;
//public class cfprob36{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int temp;
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == false){
//                break;
//            }
//        }
//        int res = arr[(arr.length/2)+1];
//        int x = 0;
//        for(int i = 0; i<n; i++){
//            if(arr[i] == res){
//                x++;
//            }
//        }
//        if(arr.length-x == 1){
//            System.out.println(1);
//        }
//        else{
//            System.out.println((arr.length-x)/2);
//        }
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

public class cfprob36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            
            int ans = n; // worst case: move everyone one by one
            int i = 0;
            while (i < n) {
                int j = i;
                // find the block of equal values a[i]
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                int left = i;           // friends strictly left of a[i]
                int right = n - j;      // friends strictly right of a[i]
                ans = Math.min(ans, Math.max(left, right));
                i = j;
            }
            System.out.println(ans);
        }
    }
}