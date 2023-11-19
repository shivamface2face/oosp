package Arrays.LinearSearch.qestion;

public class MaxWelth {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},{3,2,1,9},{1,2}
        };
        int ans=mxWel(arr);
        System.out.println(ans);
    }

     static int mxWel(int[][] arr) {
        int ans=Integer.MIN_VALUE;
         for (int i = 0; i < arr.length ; i++) {
             int rwoSum=0;
             for (int j = 0; j <arr[i].length ; j++) {
                   rwoSum+=arr[i][j];
             }

             if (rwoSum>ans){
                 ans=rwoSum;
             }



         }

         return ans;
    }
}
