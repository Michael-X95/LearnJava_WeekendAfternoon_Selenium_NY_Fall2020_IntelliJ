package basic;

public class LearnNestedClass {


    //Nested Class/child class
    // can create unlimited class inside of a class

    int num = 20;
    int num1 = 30;

    public static void main(String[] args) {
        LearnNestedClass learn = new LearnNestedClass();
        System.out.println(learn.num);// print global variable
        Computer com = new Computer();
        System.out.println(com.computerName);
        System.out.println(Computer.computerPrice);
        Computer.computerDisplay(); // static class + static method
        Computer.Mobile mobile = new Computer.Mobile(); // because it's in Computer class
        System.out.println(mobile.mobilePrice);
        System.out.println(Computer.Mobile.mobileBrand);


    }

    public static class Computer {

        String computerName = "HP";
        //static String computerPrice="2000"; - can not create static variable inside non static Nested class.
        static String computerPrice = "2000"; // can create static variable inside static nested class.

        public static void computerDisplay() {
            System.out.println("Computer Display");

        }

        public static class Mobile {

            static String mobileBrand = "iPhone";
            int mobilePrice = 1200;


        }
    }
}
