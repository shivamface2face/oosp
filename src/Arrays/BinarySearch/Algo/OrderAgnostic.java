package Arrays.BinarySearch.Algo;

public class OrderAgnostic {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,6,7,8};
        int target=3;
        int ans= OrderAgnoSrh(arr,target);
        System.out.println(ans);
        int start=0;
        int end=arr.length-1;


        boolean isAsc = arr[start]<arr[end];

    }

         static int OrderAgnoSrh(int[] arr, int k) {
             int start=0;
             int end=arr.length-1;
             int mid=start+(end-start)/2;

             if (arr[mid]==k){
                 return mid;
             }
             boolean isAsc=arr[start]<arr[end];
             if (isAsc){
                 if (arr[mid]>k){
                     end=mid-1;
                 } else{
                     start=mid+1;
                 }
             }else {
                 if (arr[mid]<k){
                     end=mid-1;
                 } else  {
                     start=mid+1;
                 }
             }

        return -1;
    }
}
