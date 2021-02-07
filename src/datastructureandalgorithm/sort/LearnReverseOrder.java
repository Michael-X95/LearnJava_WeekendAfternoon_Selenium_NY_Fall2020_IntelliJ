package datastructureandalgorithm.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnReverseOrder {

    public static void main(String[] args) {
        //Note that we have Integar here instead of
        // Int[] as Collections.reverseOrder doesn't
        // work for primitive types

        Integer[] arr = {13,7,6,45,21,9,2,100};
        //sorts arr[] in descending order

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }



}
