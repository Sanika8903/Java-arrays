package array;
import java.util.*;



public class pairs_in_array {

    public static void pairs(int numbers [],int a){
        for (int i=0; i<a; i++){
            for(int j=i+1;j<a;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int numbers [] = new int[a];
        for (int i=0;i<a;i++){
            numbers[i] = sc.nextInt();
        }
        pairs(numbers,a);

    }
    
}
