package Arrays.LinearSearch.qestion;

public class MinimumNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans=minno(arr);
        System.out.println(ans);
    }

     static int minno(int[] arr) {
       int min=arr[0];
         for (int i = 0; i < arr.length ; i++) {
             if (arr[i]<min){
                 min=arr[i];
             }
         }
         return min;
    }
}
