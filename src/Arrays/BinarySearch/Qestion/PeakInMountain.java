package Arrays.BinarySearch.Qestion;

public class PeakInMountain {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,3,2};
        int ans=peak(arr);
        System.out.println(ans);
    }

         static int peak(int[] arr) {

                 int start=0;
                 int end=arr.length-1;
                 while (start<end){
                     int mid=start+(end-start)/2;

                     if (arr[mid]>arr[mid+1]){
                         end=mid;
                     } else  {
                         start=mid+1;

                     }
                 }

                 return arr[start];


    }
}
