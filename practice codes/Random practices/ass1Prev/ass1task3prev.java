import java.util.Scanner;
import java.util.Arrays;
public class ass1task3prev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        double[] arr = new double[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        
        // Count unique elements
        int uniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if this element appears before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                uniqueCount++;
            }
        }
        
        // Create array for unique elements
        double[] arr2 = new double[uniqueCount];
        int index = 0;
        
        // Fill array with unique elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if this element appears before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not a duplicate, add to arr2
            if (!isDuplicate) {
                arr2[index] = arr[i];
                index++;
            }
        }
        System.out.println("Array without duplicates:");
        System.out.println(Arrays.toString(arr2));
    }
}