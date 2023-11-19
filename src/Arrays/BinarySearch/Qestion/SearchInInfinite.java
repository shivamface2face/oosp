package Arrays.BinarySearch.Qestion;

public class SearchInInfinite {
    public static void main(String[] args) {

        int arr[]={2,3,5,6,7,8,10,11,12,13,15,20,23,30};
        int target=15;
        System.out.println(ans(arr, target));


    }

     static  int ans(int arr[],int target){
//         first find the range
         //         start with box of size=0;
         int start=0;
         int end=1;

//          condtion for target in range
          while (target>arr[end]){
              int temp=end+1;
//              end =prev end*sizeofBox*2
              end=end+(end-start+1)*2;
              start=temp;

          }
          return bSrh(arr,start,end,target);

     }




    static int bSrh(int[] arr,int start,int end,int k) {

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
