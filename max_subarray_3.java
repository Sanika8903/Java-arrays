// this is kadane's algorithm to calculate the maximum subarray sum

package array;
import java.util.*;

public class max_subarray_3 {

    public static int Max_sum(int[] nums, int a){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i =0;i<a;i++){
            current_sum = current_sum + nums[i];
            max_sum = Math.max(max_sum,current_sum);
            if(current_sum < 0){
                current_sum = 0;
            }    
        }
        return max_sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<a;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Max_sum(numbers, a));
    }
}
