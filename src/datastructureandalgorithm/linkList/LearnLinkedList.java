package datastructureandalgorithm.linkList;

import java.util.LinkedList;

public class LearnLinkedList {


    //Manipulation with LinkedList is faster than ArrayList


    LinkedList<String>  stFathersName = new LinkedList<>();
    LinkedList<String>  pizzaList = new LinkedList<>();

    public static void main(String[] args) {
        LearnLinkedList learn = new LearnLinkedList();
        learn.stFathersName.add("William");
        learn.stFathersName.add("Bob");
        learn.stFathersName.add("Deniel");
        learn.stFathersName.add("Mac");
        learn.stFathersName.add("Mac");
        learn.stFathersName.add("Akbar");

        System.out.println(learn.stFathersName.get(2));
        // How to Retrieve all the value from LinkedList
        for (String st: learn.stFathersName){
            System.out.println("Father's Name "+st);
        }

    }

    public static void getPizzaList(){


    }

}
