package Arrays;

import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));


    }

    static void change(int[] arr){

       arr[0]=90;
    }
}
