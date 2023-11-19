package Arrays.LinearSearch.qestion;

public class EvenDigit {
    public static void main(String[] args) {
        int arr[]={12,123,5,1234,67,1};
        int ans=evnDigit(arr);
        System.out.println(ans);
    }

     static int evnDigit(int[] arr) {
        int count=0;
        for (int num:arr){
            if (evn(num)){
                count++;
            }
        }
        return count;
    }

       static boolean evn(int num) {
         int noOfDigit=digit(num);
         if (noOfDigit%2==0){
             return true;
         }
         return false;
    }
    static int digit(int num){
        int count=0;
        if (num<0){
            num=num*-1;
        }
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
