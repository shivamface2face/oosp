package Arrays.BinarySearch.Qestion;

public class IndexOfLstOcc {
    public static void main(String[] args) {

        int arr[] = {10, 15, 20, 20, 20, 20};
        int target = 20;
        int ans = indexoflstoccurance(arr, target);
        System.out.println(ans);

    }

      static int indexoflstoccurance(int[] arr, int k) {
          int start=0;
          int end=arr.length-1;
          while (start<=end){
              int mid=start+(end-start)/2;

              if (arr[mid]>k){
                  end=mid-1;
              } else if (arr[mid]<k) {
                  start=mid+1;
              }else {
                  if (mid==arr.length-1||arr[mid]!=arr[mid+1]){
                      return mid;
                  }else {
                      start=mid+1;
                  }
              }
          }
       return -1;
      }


}
