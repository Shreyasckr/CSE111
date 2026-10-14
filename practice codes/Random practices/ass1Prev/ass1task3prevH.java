import java.util.Scanner;
public class ass1task3prevH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // For each position in array
        for (int i = 0; i < N; i++) {
            int count = 1;
            
            // Check if this number was counted before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            
            // If already counted, skip
            if (alreadyCounted) {
                continue;
            }
            
            // Count occurrences from current position onward
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            
            System.out.println(numbers[i] + " - " + count + " times");
        }
    }
}


//alternative(sorting diya kora)

//import java.util.Scanner;
//import java.util.Arrays; // Required for sorting
//
//public class HomeworkTask3_Alt {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("N = ");
//        int N = sc.nextInt(); // Take integer N from the user [cite: 45]
//        int[] arr = new int[N]; // Create integer array [cite: 45]
//        
//        System.out.println("Enter " + N + " numbers:");
//        for(int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt(); // Take N numbers from the user [cite: 45]
//        }
//        
//        // Sort the array so identical numbers are adjacent
//        Arrays.sort(arr);
//        
//        // Count how many times each number appears [cite: 46]
//        for (int i = 0; i < N; i++) {
//            int count = 1;
//            
//            // Check if the next element is the same as the current one
//            // We use a while loop to fast-forward through duplicates
//            while (i + 1 < N && arr[i] == arr[i + 1]) {
//                count++;
//                i++; // Skip the duplicate element so we don't count it again
//            }
//            
//            System.out.println(arr[i] + " - " + count + " times");
//        }
//        
//        sc.close();
//    }
//}

