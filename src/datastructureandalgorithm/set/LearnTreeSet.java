package datastructureandalgorithm.set;

import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        TreeSet<String> iPhoneModel = new TreeSet<>();
        iPhoneModel.add("12 Pro Max");
        iPhoneModel.add("12 Pro");
        iPhoneModel.add("12");
        iPhoneModel.add("11 Pro Max");
        iPhoneModel.add("11 Pro");
        iPhoneModel.add("11");
        iPhoneModel.add("10");
        iPhoneModel.add("10"); // 2 same value but only shows 1
        System.out.println(iPhoneModel);
        //prints A-Z/0-9

        iPhoneModel.remove("11");
        System.out.println(iPhoneModel);
        iPhoneModel.pollFirst(); //first value will remove
        System.out.println(iPhoneModel); // removed "10" removed first value
        iPhoneModel.pollLast();
        System.out.println(iPhoneModel);// removed "12 Pro Max" removed last value
        System.out.println(iPhoneModel.contains("12 Pro Max")); //false because it was removed

    }



}
