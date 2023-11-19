package Arrays.Qestion;
import  java.util.*;
import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n=5;
         int arr[]=new int[n];
        for (int i = 0; i <5 ; i++) {
            arr[i]=in.nextInt();
        }
              int x=4;
       int cap= arr.length;
       int pos=1;

   int ans= Ins(arr,n,x,cap,pos);

        System.out.println(ans);


    }

     static int Ins(int[] arr, int n, int x, int cap, int pos) {
        if (cap==n){
            return n;
        }
        int index=pos-1;
         for (int i = n-1; i >=index ; i--) {
             arr[i+1]=arr[i];
         }
         arr[index]=x;
         return n+1;
    }

}
