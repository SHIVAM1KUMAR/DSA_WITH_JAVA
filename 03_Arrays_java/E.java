
import java.util.*;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr={
            {1,2,3},
            {5,6},
            {7,8,9}
        };
        for(int r=0;r<arr.length;r++){
            for(int col =0;col<arr[r].length;col++){
                System.out.print(arr[r][col] + " ");
            }
            System.out.println();
        }
    }
}
