package Arrays.BinarySearch.Qestion;

public class FloorOfNo {
    public static void main(String[] args) {
        int arr[]={2,3,5,8,14,16,18};
        int target=15;
        int ans= flor(arr,target);
        System.out.println(ans);
    }

     static int flor(int[] arr, int k) {
         int start=0;
         int end=arr.length-1;
         while (start<=end){
             int mid=start+(end-start)/2;

             if (arr[mid]>k){
                 end=mid-1;
             } else if (arr[mid]<k) {
                 start=mid+1;
             }else {
                 return mid;
             }
         }

         return arr[end];
    }
}
