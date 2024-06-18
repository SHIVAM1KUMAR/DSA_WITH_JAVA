import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ans =0;
        while(true){
            System.out.println("enter the operator");

        char op =sc.next().trim().charAt(0);
        if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%'){
            System.out.println("enter the two numbwer");
            int n =sc.nextInt();
            int n2 =sc.nextInt();
            if (op == '+'){
                ans =n + n2;
            }
            if (op == '-'){
                ans =n - n2;
            }
            if (op == '*'){
                ans =n  * n2;
            }
            if (op == '/'){
                ans =n / n2;
            }
            if (op == '%'){
                ans =n % n2;
            }

        }else if(op =='x' || op =='X'){
            break;
        }else{
            System.out.println("invalid users");
        }
        System.out.println(ans);
    }
      
    }
}
