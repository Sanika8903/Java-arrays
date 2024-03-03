import java.util.Scanner;

public class diagonal_sum {

    public static int sum(int nums[][],int m){
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                //primary diagonal
                if(i==j){
                    sum = sum + nums[i][j];
                }
                //secondary diagonal
                if(i+j==m-1){
                    if(i==j){
                        break;
                    }
                    sum = sum + nums[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and column");
        int m = sc.nextInt();
        int nums[][] = new int[m][m];
        for(int i=0; i<m;i++){
            for(int j=0; j<m;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(sum(nums, m));
    }
}
