import java.util.*;
public class Findmaximum {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner in =new Scanner (System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        // int max =a;
        // if(max >a){
        //     max=b;
        // }
        // if(c>max){
        //    max=c;
        // }
        int max =Math.max(c,Math.max(a,b));
        System.out.println(max);
    }

    
    }

