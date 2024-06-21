public class Evendigit {
    public static void main(String[] args) {
        int[] nums={12,252,2,3,1234};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] nums){
        int c=0;
        for(int num : nums){
            if(even(num)){
                c++;
            }
        }
        return c;
    }
    static boolean even(int num){
           int numberofdigits =digits(num);
           if(numberofdigits % 2==0){
            return true;
           }
           return false;
    }
    static int digits(int num){
        int c=0;
         while(num>0){
            c++;
            num =num /10;
         }
        return c;
    }
}
