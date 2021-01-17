package operators;

public class LearnArithmeticOperator {

    // + additive operator
    // - subtraction operator
    // * multiplication
    // / division
    // % Remainder: 40/3=13 13x3=39

    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 3;
        int total = num1 + num2;
        int balance = num1 - num2;
        int monthlyValue = num1 * num2;
        int weeklyValue = num1 / num2;
        int value = num1 % num2;
        System.out.println("Total: " + total);
        System.out.println("Balance: " + balance);
        System.out.println("Monthly Value: " + monthlyValue);
        System.out.println("Weekly Value: " + weeklyValue);
        System.out.println("Value: " + value);
    }
}
