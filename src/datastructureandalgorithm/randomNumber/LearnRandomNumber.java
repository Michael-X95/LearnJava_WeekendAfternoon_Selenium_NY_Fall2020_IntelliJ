package datastructureandalgorithm.randomnumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {

        int [] stId = new int[12];
        Random random = new Random(101); // seed means start point
        for (int i=0; i<stId.length;i++){
            stId[i] =random.nextInt(200); // bound means end point
            System.out.println(stId[i]);
        }


        System.out.println(Math.random());
        System.out.println("NY201"+Math.random());





    }






}