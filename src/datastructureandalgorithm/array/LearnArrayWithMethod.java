package datastructureandalgorithm.array;

public class LearnArrayWithMethod {

    public static void main(String[] args) {

        int[] numbers = {23, 34, 65, 12, 7, 102, 87, 46, 384};
LearnArrayWithMethod.checkMinimum(numbers);

    }

    static void checkMinimum(int num[]) {

        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];

            }
        }
        System.out.println(min);

    }

    static int[] getArray(){
        return new int[]{88,66,70,90,23,12,405};



    }



}
