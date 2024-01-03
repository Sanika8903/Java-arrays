import java.util.*;

public class trapping_rainwater {

    public static int[] max_Left(int height[],int max_left[]){
        for(int i=0;i<height.length;i++){
            if(i == 0){
                max_left[0]=height[0];
            }
            else{
                if (height[i]<=max_left[i-1]){
                    max_left[i]=max_left[i-1];
                }
                else {
                    max_left[i]=height[i];
                }
            }
        }
        // for(int i=0;i<max_left.length;i++){
        //     System.out.print(max_left[i]);
        // }
        return max_left;
    }

    public static int[] max_Right(int height[],int max_right[]){
        for(int i=height.length-1;i>=0;i--){
            if(i == height.length-1){
                max_right[height.length-1]=height[height.length-1];
            }
            else{
                if (height[i]<=max_right[i+1]){
                    max_right[i]=max_right[i+1];
                }
                else{
                    max_right[i]=height[i];
                }
            }
        }
        // for(int i=0;i<max_right.length;i++){
        //     System.out.print(max_right[i]);
        // }
        return max_right;
    }

    public static void rain_water(int max_left[],int max_right[],int height[]){
        int trapped_water = 0;
        int water_level = 0;
        for(int i = 0 ;i < height.length;i++){
            water_level = Math.min(max_left[i],max_right[i]) - height[i];
            if(water_level>=0){
                trapped_water = trapped_water + water_level;
            }
        }
        System.out.println("The total amount of trapped water is: "+trapped_water);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of bar graphs");
        int a = sc.nextInt();
        int height[] = new int[a];
        int max_left[] = new int[a];
        int max_right[] = new int[a];
        System.out.println("Enter the height of each graph");
        for(int i=0;i<height.length;i++){
            height[i] = sc.nextInt();
        }
        max_Left(height,max_left);
        max_Right(height,max_right);
        rain_water(max_left,max_right,height);
    }
}
