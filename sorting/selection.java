package array.sorting;
import java.util.*;

public class selection {

    public static void sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[minPos]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] =  nums[i];
            nums[i] = temp;
        }


        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + "\t");
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        sort(nums);
    }
}
