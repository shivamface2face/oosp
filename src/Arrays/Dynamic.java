package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        ArrayList<Integer> list=new ArrayList<>();        //integer is wrapper class
//        list.add(12);
//        list.add(34);
//        list.set(0,90);
//        list.add(78);
//        list.add(45);
//        System.out.println(list);

//        for (int i = 0; i <4 ; i++) {
//            list.add(in.nextInt());
//        }
//
//        for (int i = 0; i <4 ; i++) {
//            System.out.println(2*list.get(i));
//        }
//        System.out.println(list);


        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();

//         initilization
        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }
// add elelment

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                lists.get(i).add(in.nextInt());
            }
        }

        // print

        System.out.println(lists);






    }
}
