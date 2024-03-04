import java.util.*;

public class linear_search {

    public static boolean search(int nums[][],int key){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j] == key){
                    System.out.println("Element found at index " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int nums[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key to search");
        int k = sc.nextInt();
        search(nums, k);
    }
}
