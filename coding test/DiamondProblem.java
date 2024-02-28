package array.sorting;

import java.util.Scanner;

public class DiamondProblem {

    public static int minDiamondBoxes(int[] arr, int t) {
        int n = arr.length;
        int totalBoxes = 0;

        for(int i=0;i<t;i++){
            if(i == t-1){
                totalBoxes = totalBoxes + n-i;
            }
            else{
                totalBoxes = totalBoxes +1 ;
            }
        }

        return totalBoxes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();
        System.out.println(minDiamondBoxes(arr, t));
    }
}