public class Linears{
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,-44};
        int target =5;
        int ans =ls(nums,target);
        System.out.println(ans);
    }
    static int ls(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int ele =arr[i];
            if(ele == target){
                return i;
            }
        }
        return -1;
    }
}