package datastructureandalgorithm.arrayList;

import datastructureandalgorithm.array.LearnArray;

import java.util.ArrayList;

public class LearnArrayList {

    //ArrayList
    //No need to declare any Array size / Dynamic Array

    //ArrayList type
    ArrayList<String> studentAddress = new ArrayList<>(); // nonstatic type
    public static ArrayList<Integer> studentMobileNumber = new ArrayList<Integer>(); //static type

    public static void main(String[] args) {
       LearnArrayList learn= new LearnArrayList();
        learn.studentAddress.add("Manhattan,NY");
        learn.studentAddress.add("Queens,NY");
        learn.studentAddress.add("Jamaica,NY");
        learn.studentAddress.add("Albany,NY");
        learn.studentAddress.add("Bronx,NY");

        System.out.println(learn.studentAddress.get(2));
        System.out.println(learn.studentAddress.get(5));
        System.out.println("Size : "+learn.studentAddress.size());

        //How to Retrieve all the value from ArrayList
        for (String st: learn.studentAddress){
            System.out.println("Student Address "+st);
        }

        System.out.println("**************** After Remove ");
        learn.studentAddress.remove("Albany,NY");

        String [] stName = new String[5000];
        stName[0]="James";
        stName[1]="Jack";
        stName[2]="Bob";

        //Wrapper class:
        //Integer: Int
        //Byte: byte
        //Short: short
        //Double: double
        //Boolean: boolean

    }


}
