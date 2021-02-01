package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {

    // Key Points
    // For operation like add, remove, containsKey, time complexity is 0
    // TreeMap always keeps the elements in a sorted (increasing) order, while the elements in HashMap have no order

    public static void main(String[] args) {
        int[] numbers = {23, 45, 66, 45, 78, 34, 201, 88, 66, 34, 7, 9, 3, 603, 7, 301, 7, 8, 7};
        LearnHashMapTravers.printFrequency(numbers);
    }

    public static void printFrequency(int[] num) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            Integer count = hmap.get(num[i]);

            if (hmap.get(num[i]) == null) {
                hmap.put(num[i], 1);
            } else {
                hmap.put(num[i], ++count);
            }
        }
        for (Map.Entry mp : hmap.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
        }
    }
}