package Arrays.LinearSearch.qestion;


public class SrchInRange {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans=lin(arr,0,3,4);
        System.out.println(ans);
    }

     static int lin(int[] arr, int start,int end,int k) {
         for (int i = start; i <=end ; i++) {
             if (arr[i]==k){
                 return i;
             }
         }
         return -1;
    }
}
