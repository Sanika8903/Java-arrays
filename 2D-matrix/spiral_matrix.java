import java.util.*;

public class spiral_matrix {

    public static void spiral(int nums[][],int m,int n){
        int startRow = 0;
        int endRow = m-1;
        int startColumn = 0;
        int endColumn = n-1;
        while(startRow <= endRow && startColumn <= endColumn){
            // top
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(nums[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(nums[i][endColumn] + " ");
            }

            //bottom
            for(int j=endColumn-1; j>=startColumn; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(nums[endRow][j] + " ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(nums[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }     
    }      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int m = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n = sc.nextInt();
        int nums[][] = new int[m][n];
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        spiral(nums, m, n);
    }
}
