package array;
import java.util.*;

public class largest_no {
    public static void calculation(int numbers[]){
        int largest = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + largest);
    }
    
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the length of array");
        int a = sc.nextInt();
        int numbers[]= new int[a];
        System.out.println("enter the elements of list");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        calculation(numbers);
    }
}
