package Arrays.LinearSearch.qestion;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=7;
        int ans[]=srch(arr,target);
        System.out.println(Arrays.toString(ans));

    }

     static int[] srch(int[][] arr, int target) {
        int max=Integer.MIN_VALUE;
         for (int i = 0; i <arr.length ; i++) {
             for (int j = 0; j <arr[i].length ; j++) {
                 if (arr[i][j]==target){
                     return new int[]{i,j};
                 }

             }
         }
        return new int[]{-1,-1};
    }
}
