package datastructureandalgorithm.arrayList;

import java.util.ArrayList;

public class LearnArrayList {

    // ArrayList
    //No need to declare Array size / Dynamic Array

    // ArrayList type
    ArrayList <String> studentAddress = new ArrayList<>();

    public static ArrayList<Integer> studentMobileNumber= new ArrayList<Integer>();

    public static void main(String[] args) {

        LearnArrayList learn= new LearnArrayList();
        learn.studentAddress.add("Manhattan,NY"); //0
        learn.studentAddress.add("Queens,NY"); //1
        learn.studentAddress.add("Jamaica,NY");//2
        learn.studentAddress.add("Albany,NY");//3
        learn.studentAddress.add("Bronx,NY");//3
        learn.studentAddress.add("Bronx1,NY");//4
        learn.studentAddress.add("Jersey City,NJ");//5

        System.out.println(learn.studentAddress.get(2));
        System.out.println(learn.studentAddress.get(5)); // 4+1
        System.out.println("Size : "+learn.studentAddress.size());

        // How to Retrieve all the value from ArrayList
        for (String st: learn.studentAddress ){
            System.out.println("Student Address "+st);
        }
        System.out.println("****************** After Remove ");
        learn.studentAddress.remove("Albany,NY");
        for (String st: learn.studentAddress ){
            System.out.println("Student Address after remove "+st);
        }
        learn.studentAddress.add("Denver,CO");
        for (String st: learn.studentAddress ){
            System.out.println("Student Address after add "+st);
        }
        System.out.println("*********** List of value *********************");
        ArrayList<String> names=new ArrayList<>();
        System.out.println(names.size());
        names.add("Zima");
        names.add("Parisha");
        names.add("Easha");
        names.add("Alili");
        System.out.println("Names are "+names);


        String [] stName= new String[5000];
        stName[0]="James";
        stName[1]="Jack";
        stName[2]="Bob";

        // Wrapper class:
        // Integer : int
        // Byte : byte
        // Short: short
        // Double : double
        // Boolean : boolean




    }















}