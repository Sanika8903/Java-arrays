package array.sorting;

import java.util.Scanner;

public class diamond {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] nums = str.toCharArray();
        int [] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp = 0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    temp =temp + 1;
                }
            }
            result[i] = temp;
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }

        }  
      }
