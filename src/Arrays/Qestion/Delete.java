package Arrays.Qestion;

public class Delete {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=4;
        int n= arr.length;
        int ans= delt(arr,n,x);
        System.out.println(ans);

    }

       static int delt(int[] arr, int n, int x) {
        int i;
           for ( i = 0; i <n ; i++) {
               if (arr[i]==x){
                   break;
               }
           }
           if (i==n){
               return n;
           }
           for (int j = i; j <n-1 ; j++) {
               arr[j]=arr[j+1];
           }
        return (n-1);
    }
}
