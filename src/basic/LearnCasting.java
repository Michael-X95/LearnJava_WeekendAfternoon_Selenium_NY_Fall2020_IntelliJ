package basic;

public class LearnCasting {

    //casting: Casting means converting data type
    //Primitive DataType to Primitive DataType
    //NonPrimitive to NonPrimitive
    //int variable cannot access double dataType
    //double price = 35.99;
    //int discountedPrice=price;
    //convert by addint (int) in front of price; in order for int to access double
    //once converted and access, int can only print as whole number. so only 35 will be printed
    public static void main(String[] args) {

        double price = 35.99;
        int discountedPrice = (int) price;
        System.out.println(discountedPrice);

        int num1 = 60;
        int num2 = 40;
        int num3 = num1;
        int num4 = num3 + num2;
        System.out.println("Total is " + num4);

        int age = 24;
        double newAge = (double) age;
        System.out.println("int to double " + newAge);

        int number = 56;
        byte total = (byte) number;
        System.out.println("int to byte " + total);

        String name = "Arafat";
        String stName = name;
        String ssn = "1234";
        int newSSN = Integer.parseInt(ssn);
        System.out.println(newSSN);
        int newSsn1 = Integer.valueOf(ssn);
        System.out.println(newSsn1);

    }
}
