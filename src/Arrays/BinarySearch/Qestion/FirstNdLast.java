package Arrays.BinarySearch.Qestion;

public class FirstNdLast {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int[] ans=fstlst(arr,target);
        System.out.println(ans);
    }

        static int[] fstlst(int[] arr, int target) {
        int ans[]={-1,-1};
        int start=serch(arr,target,true);
        int end=serch(arr,target,false);
        arr[0]=start;
        arr[1]=end;
        return ans;
    }

   static   int serch(int arr[],int k,boolean firstStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>k){
                end=mid-1;
            } else if (arr[mid]<k) {
                start=mid+1;
            }else {
              ans= mid;
              if (firstStartIndex==true){
                  end=mid-1;
              }else {
                  start=mid+1;
              }
            }
        }
        return  ans;

    }

}
