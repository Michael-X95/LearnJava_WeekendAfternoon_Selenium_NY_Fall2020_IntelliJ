package datastructureandalgorithm.sort;

public class LearnSwap {

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 55;
        int temp;
        System.out.println("Number1 value is "+num1);
        System.out.println("Number1 value is "+num2);

        temp=num1;
        num2=temp; // makes num2 = temp, which temp = num1. num1 = 45
        num1=temp+num2; //num1 = 45+45 because of line 13 making num2 = 45.
        temp=num1; // temp = num1, num1 = 90
        System.out.println(temp);



    }












}
