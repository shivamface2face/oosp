package Arrays.BinarySearch.Qestion;
import java.util.*;
public class SmallestLetter {
    public static void main(String[] args) {
        char[] str = {'c', 'f', 'j'};
        char target = 'a';
        char ans = Small(str, target);
        System.out.println(ans);

    }


     static char Small   ( char[] arr, char k){
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start) / 2;
            while (start <= end) {

                if (arr[mid] > k) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return arr[start];
        }


    }
