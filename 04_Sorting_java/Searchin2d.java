import java.util.Arrays;

public class Searchin2d {
    public static void main(String[] args) {
         int [][] arr={
            {23,34,1},
            {78,45,45,12},
            {4,5,6,78,1597}
         };
          int target =34;
          int [] ans =search(arr,target);

         System.out.println(Arrays.toString(ans));
         System.out.println(max(arr));
    }
    static int [] search(int [][] arr,int target){
          for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]== target){
                        return new int[]{r,c};
                }
            }
          }
          return new int[]{-1,-1};
    }
    static int max(int [][] arr){
        int max=Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++){
          for(int c=0;c<arr[r].length;c++){
              if(arr[r][c]> max){
                      max=arr[r][c];
              }
          }
        }
        return max;
}
}
