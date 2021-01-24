package exceptionhandling;

public class SalaryCalculator {
int div;

    public static void main(String[] args) {
        SalaryCalculator.doDivision(12, 3);


    }


    public static int doDivision(int num1, int num2) {

        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("Division value is " + result);
            return result = 0;
        } catch (Exception e) {
          //  e.printStackTrace();
            System.out.println("This is Arithmetic Exception");
            //use this exception incase of error for example using anything/0.
        }
        return result;
    }


}








