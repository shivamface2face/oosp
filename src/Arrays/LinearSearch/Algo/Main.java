package Arrays.LinearSearch.Algo;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans=linear(arr,3);
        System.out.println(ans);


    }
     static int linear(int arr[],int k){
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i]==k){
                 return i;
             }

         }
         return -1;
    }
}
