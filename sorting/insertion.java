package array.sorting;
import java.util.*;

public class insertion {

    public static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev >=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--;
            } 
            nums[prev+1] = curr;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        sort(nums);
    }
}
