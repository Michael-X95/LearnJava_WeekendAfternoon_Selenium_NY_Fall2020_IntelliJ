package datastructureandalgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    // Queue: FIFO Order (First in First out)


    public static void main(String[] args) {
        Queue<String> name =new LinkedList<>();
        name.add("dalal");
        name.add("Gahania");
        name.add("lamia");
        name.add("Nafiz");
        name.add("Farhana");

        for (String st: name){
            System.out.println("Patient Name "+st);
        }

        System.out.println("************** After Remove ");
        name.remove("lamia");
        for (String st: name){
            System.out.println("Patient Name "+st);
        }

        System.out.println("*********************************************");

        System.out.println(name.element());
        System.out.println("************* Poll() Method ********************************");
        // Peek and Remove
        System.out.println(name.poll());
        for (String st: name){
            System.out.println("Patient Name "+st);
        }

        System.out.println("*************** Peek() Method ******************************");
        // Only Peek the value from list
        System.out.println(name.peek());
        for (String st: name){
            System.out.println("Patient Name "+st);
        }
        System.out.println("**********************************************");
        System.out.println(name.remove()); // Only remove value from list
        System.out.println("**********************************************");
        System.out.println(name.poll());
        for (String st: name){
            System.out.println("Patient Name "+st);
        }



    }



}