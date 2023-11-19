package Arrays.BinarySearch.Qestion;

public class IndexOfFrstOcr {
    public static void main(String[] args) {
        int arr[]={1,10,10,20,20};
        int target=10;
        int ans=firstOccurance(arr,target);
        System.out.println(ans);
    }

        static int firstOccurance(int[] arr, int k) {
            int start=0;
            int end=arr.length-1;
            while (start<=end){
                int mid=start+(end-start)/2;

                if (arr[mid]>k){
                    end=mid-1;
                } else if (arr[mid]<k) {
                    start=mid+1;
                }else {
                   if (mid==0||arr[mid-1]!=arr[mid]){
                       return mid;
                   }else {
                       end=mid-1;
                   }
                }
            }

            return -1;

        }
}
