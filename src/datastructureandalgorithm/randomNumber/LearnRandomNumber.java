package datastructureandalgorithm.randomNumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
        double[] stID = new double[10];
        Random random = new Random();
        for (int i = 0; i < stID.length; i++) {
            stID[i] = random.nextInt(400);
            System.out.println(stID[i]);
        }


    }
}
