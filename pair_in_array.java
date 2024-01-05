package array;
import java.util.*;

public class pair_in_array {

    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print("("+ numbers[i ]+ "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int a = sc.nextInt();
        System.out.println("Enter the elements of array");
        int numbers[] = new int[a];
        for (int i = 0; i <= a; i++) {
            numbers[i] = sc.nextInt();
        }
        pairs(numbers);
    }
}
