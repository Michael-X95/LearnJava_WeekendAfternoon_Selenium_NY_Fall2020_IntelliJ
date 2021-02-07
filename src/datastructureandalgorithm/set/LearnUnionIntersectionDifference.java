package datastructureandalgorithm.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntUnaryOperator;

public class LearnUnionIntersectionDifference {

    public static void main(String[] args) {

        int num1[] = {1, 4, 5, 7, 12, 24, 66, 56, 78};
        int num2[] = {2, 7, 4, 8, 12, 79, 44, 102, 203, 304};
        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1, 4, 5, 7, 12, 24, 66, 56, 78}));
        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2, 7, 4, 8, 12, 79, 44, 102, 203, 304}));

        // TO Do Union Set
        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two set " + union); // only prints one value one time, does not print duplicate

        //To do Intersection
        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two set " + intersection);//Intersection = common value/duplicated value

        //To Do Symmetric Difference
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two set " + difference); //only gets the difference in Number1 section only

        //To Do Symmetric Difference
        Set<Integer> difference2 = new HashSet<>(number2);
        difference2.removeAll(number1);
        System.out.println("Difference of two set " + difference2); //only gets the difference in Number2 section only


    }


}
