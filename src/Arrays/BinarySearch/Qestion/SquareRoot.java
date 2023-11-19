package Arrays.BinarySearch.Qestion;

public class SquareRoot {
    public static void main(String[] args) {
       int x=15;
        int i=1;
        while (i*i<x){
            i++;
        }
        System.out.println(i-1);

        int ans=sqrtOfNo(x);
        System.out.println(ans);
    }

         static int sqrtOfNo(int x) {
        return -1;
    }
}
