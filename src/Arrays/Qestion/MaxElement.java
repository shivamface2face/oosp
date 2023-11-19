package Arrays.Qestion;

public class MaxElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       int ans=maxi(arr);
        System.out.println(ans);
        int ran=maxinRange(arr,0,3);
        System.out.println(ran);
    }

     static int maxi(int[] arr) {
        int max=arr[0];

         for (int i = 0; i < arr.length; i++) {
             if (arr[i]>max){
                 max=arr[i];
             }

         }
         return max;
    }
    static int maxinRange(int[] arr,int start,int end) {
        int max=arr[0];

        for (int i = start; i <=end; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
