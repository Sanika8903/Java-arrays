package array;
import java.util.*;

import java.util.Scanner;

public class max_subarray_2 {

    public static int calculate(int[] numbers,int n){
        int[] prefix = new int[n];
        prefix[0] = numbers[0];
        for(int i=1;i<n;i++){
           prefix[i] = prefix[i-1] + numbers[i];
        }
        int max_sum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int current_sum = 0;
            for(int j=i;j<n;j++){
                if(i==0){
                    current_sum = prefix[j];
                }
                else{
                current_sum = prefix[j] - prefix[i-1];
                }
            }
            if(current_sum>max_sum){
                max_sum = current_sum;
            }
        }
        return max_sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(calculate(numbers,n));
    }
}
