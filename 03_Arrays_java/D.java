import java.util.Arrays;
import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    // int [][] arr=new int[3][];
    // int [][]arr2D ={
    //     {1,2,3},
    //     {4,5,},
    //     {6,7,8,9}
    // };
    Scanner sc =new Scanner(System.in);
    int[][] arr=new int[3][2];
    System.out.println(arr.length);
    for(int row=0; row < arr.length; row++){
    for(int col =0; col < arr[row].length;col++){
         arr[row][col]=sc.nextInt();     
    }
    }


    for(int row=0; row < arr.length; row++){
        for(int col =0; col < arr[row].length;col++){
             System.out.print(arr[row][col] + " ");    
        }
  System.out.println();
        }

        for(int r=0;r<arr.length;r++){
            System.out.println(Arrays.toString(arr[r]));
        }


  }  
}
