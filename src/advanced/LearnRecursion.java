package advanced;

import datastructureandalgorithm.sort.LearnBubbleSort;

public class LearnRecursion {

    //Recursion: process in which a method calls itself continuously
    //Must call itself
    //Must have a base case
    //Must change its state and move toward the base case
    static int count =0;
    public static void tvDisplay(){
        count++;
        if (count<10){
            System.out.println("This is TvDisplay");
            tvDisplay(); //Recursion - calling itself
        }
    }


    public static void main(String[] args) {
        LearnRecursion.tvDisplay();
    }
}
