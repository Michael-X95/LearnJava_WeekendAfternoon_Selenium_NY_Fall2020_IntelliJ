package datastructureandalgorithm.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {

    public static void main(String[] args) {
        List<String> stateNameList=new LinkedList<>();
        List<String> stateNameList1=new ArrayList<>();
        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("WI");
        stateNameList.add("KS");
        stateNameList.add("AL");
        stateNameList.add("CA");
        stateNameList.add("VA");
        stateNameList.add("MI");
        stateNameList.add("CO");
        stateNameList.add("IL");
        stateNameList.add("MD");
        stateNameList.add("HI");
        stateNameList.add("OH");
        stateNameList.add("CT");
        stateNameList.add("NC");

        // How to retrieve all the value
//        for (String st: stateNameList){
//            System.out.println("State Name :"+st);
//        }

        System.out.println("****************** Before Remove");
        Iterator it =stateNameList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("****************** After Remove");
        stateNameList.remove("AL");
        Iterator ite =stateNameList.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }


    }




}