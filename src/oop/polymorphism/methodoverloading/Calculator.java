package oop.polymorphism.methodoverloading;

public class Calculator {

    // Method OverLoading

    public static void main(String[] args) {
        int number1=23;
        int number2=33;
        Calculator.doSum(34,45);
        Calculator.doSum(44,55,66);
        Calculator.doSum(88,99,111,123,"James");

        Calculator.stInfo();
        Calculator.stInfo("James William");
        Calculator.stInfo("Jack","NY");
        Calculator.stInfo("Bob","NJ",5000);

    }


    public static void doSum(int num1, int num2){
        int total= num1+num2;
        System.out.println("Total is "+total);
    }

    public static void doSum(int num1, int num2, int num3){
        int total= num1+num2+num3;
        System.out.println("Total is "+total);
    }

    public static void doSum(int num2, int num1, int num3, int num4, String name){
        int total= num1+num2+num3+num4;
        System.out.println("Total is "+total);
    }

    public static void stInfo(){
        System.out.println("Student Information");
    }
    public static void stInfo(String name){
        System.out.println("Student name is "+name);
    }

    public static void stInfo(String name, String address){
        System.out.println("Student name is "+name+" Address is "+address);
    }

    public static void stInfo(String name, String address, int courseFee){
        System.out.println("Student name is "+name+" Address is "+address+" Course Fee "+courseFee);

    }





}
