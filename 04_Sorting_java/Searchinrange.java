public class Searchinrange {
    public static void main(String[] args) {
        int [] arr={12,3,14,15,15,1,61,7,1,8};
            int target =3;
            System.out.println(ls(arr,target,1,3));
        
    }
    static int ls(int[] arr, int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int ele =arr[i];
            if(ele == target){
                return i;
            }
        }
        return -1;
    }
}
