package array.sorting;

import java.util.Scanner;

public class bubble {

    public static void bubble_sort(int[] nums,int a){
        int temp = 0;
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(nums[i]+ " ");
        }
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
        bubble_sort(numbers, a);
    }
}
