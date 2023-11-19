package Arrays.BinarySearch.Algo;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        int target=3;
        int ans= bSrh(arr,target);
        System.out.println(ans);
    }

      static int bSrh(int[] arr,int k) {
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

        return -1;

    }
}
