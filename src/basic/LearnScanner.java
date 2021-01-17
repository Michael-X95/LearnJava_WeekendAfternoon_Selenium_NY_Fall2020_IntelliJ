package basic;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int firstNumber = input.nextInt();
        System.out.println("First Number: " + firstNumber);

        System.out.println("Input second number");
        int secondNumber = input.nextInt();
        System.out.println("Second Number: " + secondNumber);

        int result = firstNumber * secondNumber;

        System.out.println("Expected Output: " + firstNumber + secondNumber + "=" + result);


        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("First Name: " + firstName);

        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Last name: " + lastName);

        System.out.println("Full name is: " + firstName + " " + lastName);

        System.out.println("Enter Course Fee");
        double cFee = input.nextDouble();
        System.out.println("Course fee is " + cFee);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("My Age is " + age);

        input.close();


    }
}
