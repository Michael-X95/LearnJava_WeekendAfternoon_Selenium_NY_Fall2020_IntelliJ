package basic;

public class LearnStatic {

    // Declare variable, declare dataType with variable name
    int age;
    // Declare variable and assign value
    int pizzaPrice = 25;

    public static String stName = "Easha"; // static global variable
    String stAddress = "NewYork"; // non static global variable
    static String stFatherName; // static
    String stMotherName;// non static

    public static void tvDisplay() {
        System.out.println("TV Display is UHD");
    }

    public void display() {
        System.out.println("Display is good");
    }

    public static void main(String[] args) {
        // semicolon we use to complete a statement
        // how can we call a static variable inside main method?
        // static variable call by name as that variable in class level.

        LearnStatic.stName = "Kevin";// reassign variable to a value
        LearnStatic.stName = "Arafat";// prints only the most recent value
        System.out.println(LearnStatic.stName);
        // how can we call a non static variable inside main method?
        // to call a non static variable/Method we need create Object then call by
        // object name.

        // How to create a object?
        // className objectName = new constructorOfClass();
        LearnStatic obj = new LearnStatic();
        // obj.stAddress;
        System.out.println(obj.stAddress);
        obj.age = 34;
        System.out.println(obj.age);
        obj.pizzaPrice = 45;
        System.out.println("pizza Price " + obj.pizzaPrice);

        String stPhoneNumber = "456456456"; // local variable
        LearnStatic.tvDisplay();
        LearnStatic.stFatherName = "Bob Willam";
        System.out.println("Student Father name is " + LearnStatic.stFatherName);
        obj.stMotherName = "Mom Willam";
        System.out.println("Student Mother name is " + obj.stMotherName);
        obj.display();

    }

}
