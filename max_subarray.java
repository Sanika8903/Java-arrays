// this is the brute force approach of the problem
package array;
import java.util.Scanner;

public class max_subarray {
    public static void calculate(int numbers[], int n) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + numbers[k];
                }
                if(sum > max_sum){
                    max_sum = sum;
                }
            }
           
        }
         System.out.println(max_sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        calculate(numbers, n);
    }
}
