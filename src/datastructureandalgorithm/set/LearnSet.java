package datastructureandalgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is an interface which extends collection. it is an un order collection of objects in which
    // duplicate values can not be stored

    //Set is implemented by HashSet,LinkedHashSet or UseTreeSet

    //A set is a set of values which is not allowed duplicate elements. It's a parent interface of all set classes like TreeSet, HashSet.
    //A HashSet is set where elements are nto sorted or ordered. It is faster than a TreeSet.

    public static void main(String[] args) {

        Set<String> mobileBrand = new HashSet<>();
        mobileBrand.add("iPhone");
        mobileBrand.add("google");
        mobileBrand.add("nokia");
        mobileBrand.add("blackBerry");
        mobileBrand.add("samsung");
        mobileBrand.add("condor");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("nokia"));
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("LG"));

        //in order from top to bottom



    }







}
