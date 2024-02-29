package array;
import java.util.*;
public class buy_and_sell_stocks {

    public static int max_profit(int[] nums,int a){
        int buying_price = Integer.MAX_VALUE;
        // int selling_price = 0;
        int profit = 0;
        for(int i =0;i<a;i++){
            if(buying_price<nums[i]){
                profit = Math.max(nums[i] - buying_price,profit);
            }
            else{
                buying_price = nums[i];
            }
        }
        return profit;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of days");
        int a = sc.nextInt();
        int [] days = new int[a];
        System.out.println("Enter the price of stock on each day");
        for(int i=0;i<a;i++){
            days[i] = sc.nextInt();
        }
        System.out.print("max profit is ");
        System.out.print(max_profit(days, a));
    }
}
