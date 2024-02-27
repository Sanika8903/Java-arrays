package array.sorting;
import java.util.Scanner;

public class counting {

    public static void sort(int[] nums){
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] frequency = new int[max+1];
        for(int i=0;i<nums.length;i++){
            frequency[nums[i]] = frequency[nums[i]] + 1;
        }
        int index = 0;
        for(int i=0;i<=max;i++){
            int count = frequency[i];
            while(count !=0){
                nums[index] = i;
                index++;
                count--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
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
