import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int num = in.nextInt();
         if(num <= 10000){
            num = num+ 2100;
         }
         else{
            System.out.println("You have to already");
         }
         System.out.println(num);
    }
}
