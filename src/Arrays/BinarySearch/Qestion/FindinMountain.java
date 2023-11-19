//package Arrays.BinarySearch.Qestion;
//
//public class FindinMountain {
//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,4,3,2};
//        int peak=peak(arr);
//        int firstTry=bSrh(arr,target,0,peak)
//        if (firstTry!=-1) {
//            return firstTry;
//        }
////        search in 2nd half
//
//        int ans=findmount(arr);
//        System.out.println(ans);
//
//    }
//
//    static int bSrh(int[] arr,int k) {
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//
//            if (arr[mid]>k){
//                end=mid-1;
//            } else if (arr[mid]<k) {
//                start=mid+1;
//            }else {
//                return mid;
//            }
//        }
//
//        return -1;
//
//    }
//
//
//
//}
