package datastructureandalgorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    //Stack:LIFO last in first out
    //Pushing element on top of the stack: Push() adds to the last one
    //Popping element from the top of the stack: pop() removes the last one
    //Looks at the object at the top of the stack without remove it from the stack: peek()

    public static void main(String[] args) {
        Stack<String> clothingList = new Stack<>();
        clothingList.push("Pants");
        clothingList.push("Skirt");
        clothingList.push("Hat");
        clothingList.push("Gloves");
        clothingList.push("Scarf");
        clothingList.push("T-Shirt");
        clothingList.push("Boots");
        clothingList.push("Heels");
        System.out.println(clothingList);
        System.out.println(clothingList.pop()); //popped/removed the last one "heels"
        System.out.println(clothingList.push("Apron")); // added Apron to the list
        System.out.println(clothingList);
        System.out.println(clothingList.pop()); //popped/removed the last one "Apron"
        //using pop method to pop the last value from the list
        System.out.println(clothingList);

        System.out.println("*****************************************************************");
        Stack<String> clothingID = new Stack<>();
        for (int i=0; i<7; i++){
            clothingID.push("CL"+i);
        }
        System.out.println(clothingID);
        //How to retrieve all the value and pop?
        Iterator it = clothingID.iterator();
        while(it.hasNext()){
            System.out.println("Pop value : " +clothingID.pop());

        }
        //Retrieve all the value
        for(String st: clothingID){
            System.out.println(st);
        }

        Stack<Integer> priceList = new Stack<>();
        priceList.push(230);
        priceList.push(330);
        priceList.push(430);
        priceList.push(530);
        priceList.push(630);
        priceList.push(730);

        LearnStack.stackSearch(priceList, 530);

    }

    public static void stackSearch (Stack<Integer>sta, int element){
        Integer position = sta.search(element);
        if (position == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position "+position);
            //search from bottom up
        }

    }
}
