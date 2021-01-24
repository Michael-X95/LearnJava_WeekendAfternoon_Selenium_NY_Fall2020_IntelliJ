package exceptionhandling;

import method.LearnMethod;

import java.util.Scanner;

public class LearnExceptionHandling {
    //Exception: something is not regular outcomes
    //Five key word: try,catch.throw, throws, finally

    //ArithmeticException
    //It is thrown when an exceptional condition has occurred in an arithmetic operation.
            //ArrayIndexOutOfBoundsException



    public static void main(String[] args) {
//        Scanner inputNumber=new Scanner(System.in);
//        System.out.println("Enter number");
//        int num=inputNumber.nextInt();
//        System.out.println((num));

        int num1=20;
        int num2=0;
        int result=20/0;
        System.out.println("Result is "+result);

        LearnMethod learnMethod = new LearnMethod();
        learnMethod.doDivision(23,0);

    }


}
