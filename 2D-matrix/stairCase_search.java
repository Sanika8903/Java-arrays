import java.util.*;

public class stairCase_search {

    public static boolean search(int matrix[][],int key,int m){
        int i=0;
        int j=m-1;
        while(i<m && j>=0){
            if(key == matrix[i][j]){
                System.out.println("number found at index (" + i + ","+ j + ")");
                return true;
            }
            else if(key<matrix[i][j]){
                j = j-1;
            }
            else if(key>matrix[i][j]){
                i = i+1;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int matrix[][] = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key to be searched");
        int key = sc.nextInt();
        search(matrix, key, m);
    }
}
