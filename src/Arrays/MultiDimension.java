package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
         1 2 3  0th
         4 5 6  1st
         7 8 9  2nd

         */

//        input

        int arr[][]=new int[3][3];
     // for row
        for (int i = 0; i < arr.length; i++) {

//            for coloum
            for (int j = 0; j < arr[i].length ; j++) {

                arr[i][j]=in.nextInt();

            }
        }

//        output

        // for row
        for (int i = 0; i < arr.length; i++) {

//            for coloum
            for (int j = 0; j < arr[i].length ; j++) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }

        for (int i = 0; i < arr[i].length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
