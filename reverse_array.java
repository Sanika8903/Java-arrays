package array;
import java.util.*;

public class reverse_array {

    public static void reverse(int numbers[],int n){
        System.out.println("the reversed array is:");
        for (int i=n-1;i>=0;i--){
            System.out.print( numbers[i] + " ");
        }
    }

   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int numbers [] = new int[n];
    for (int i=0;i<n;i++){
        numbers[i] = sc.nextInt();
    }
    reverse(numbers,n);
   } 
}
