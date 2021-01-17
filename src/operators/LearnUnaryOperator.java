package operators;

public class LearnUnaryOperator {

    // Increment operator: ++ always add 1 for future
    // PreIncrement: ++number
    // PostIncrement: number++

    // Decrement operator: -- always minus 1 for future
    // PreDecrement: --number
    // PostDecrement: number--
    static int num1 = 44;

    public static void main(String[] args) {
        int number = 30;
        ++number; //1+30=31
        --number;
        number--;
        number++;//31+     1 for future
        System.out.println(number);

        LearnUnaryOperator.num1 = 55;
        System.out.println(LearnUnaryOperator.num1);


    }

}
