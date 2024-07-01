public class OrderAgnosticBs {
    public static void main(String[] args) {
        int []arr ={-12,-11,-5,-2,0,2,3,4,15,16,18,22,45,89};
        int target =22;
        int ans= OrderAgnosticBs(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBs(int[]arr,int target){

      int s=0;
      int e=arr.length-1;

boolean isAsc = arr[s]<arr[e];


while(s<=e){

int mid =s+(e-s)/2;
if(arr[mid]== target){
    return mid;
}

      if(isAsc){
        if(target <arr[mid]){
             e =mid-1;
        }else{
            s=mid+1;
        }
      }else{
        if(target >arr[mid]){
            e =mid-1;
       }else{
           s=mid+1;
      }
       
    }
   
}
return -1;
}
}

