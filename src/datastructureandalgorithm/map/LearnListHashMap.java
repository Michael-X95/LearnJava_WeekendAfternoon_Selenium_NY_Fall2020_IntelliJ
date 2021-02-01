package datastructureandalgorithm.map;

import java.util.*;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String> stateNameOfUSA = new ArrayList<>();
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("WI");
        stateNameOfUSA.add("KS");
        stateNameOfUSA.add("AL");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("VA");
        stateNameOfUSA.add("MI");
        stateNameOfUSA.add("CO");
        stateNameOfUSA.add("IL");
        stateNameOfUSA.add("MD");
        stateNameOfUSA.add("HI");
        stateNameOfUSA.add("OH");
        stateNameOfUSA.add("CT");
        stateNameOfUSA.add("NC");

        List<String> stateNameOfCANADA = new ArrayList<>();
        stateNameOfCANADA.add("Toronto");
        stateNameOfCANADA.add("Ontario");
        stateNameOfCANADA.add("Montreal");
        stateNameOfCANADA.add("Quebec");
        stateNameOfCANADA.add("Ottawa");
        stateNameOfCANADA.add("Victoria");
        stateNameOfCANADA.add("Vancouver");

        List<String> stateNameOfNepal = new ArrayList<>();
        stateNameOfNepal.add("Kathmandu");
        stateNameOfNepal.add("Pokhara");
        stateNameOfNepal.add("bhaktapur");
        stateNameOfNepal.add("Mustang");
        stateNameOfNepal.add("Godawari");
        stateNameOfNepal.add("lalitpur");
        stateNameOfNepal.add("Jhapa");


        Map<String, List<String>> stMap= new HashMap<>();
        stMap.put("USA",stateNameOfUSA);
        stMap.put("CANADA",stateNameOfCANADA);
        stMap.put("NEPAL",stateNameOfNepal);

        for (Map.Entry<String,List<String>> entry: stMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


}