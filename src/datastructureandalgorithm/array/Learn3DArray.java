package datastructureandalgorithm.array;

public class Learn3DArray {

    //3D Array = 1D+2D Array
    //DataType [size][row][column] arrayName = new Datatype [size][row][column];

    //Delcare 3D Array

    static String[][][] pizza = new String[2][6][5];
    static String pizza1 [][][]  = new String[2][6][5];

    public static void main(String[] args) {
        //Assign value
        Learn3DArray.pizza[0][0][0] = "sl";
        Learn3DArray.pizza[0][0][1] = "Pizza Type";
        Learn3DArray.pizza[0][0][2] = "Price";
        Learn3DArray.pizza[0][0][3] = "Qty";
        Learn3DArray.pizza[0][0][4] = "Amount";

        Learn3DArray.pizza[0][1][0] = "101";
        Learn3DArray.pizza[0][1][1] = "Pepperoni";
        Learn3DArray.pizza[0][1][2] = "35";
        Learn3DArray.pizza[0][1][3] = "5";
        Learn3DArray.pizza[0][1][4] = "175";

        Learn3DArray.pizza[0][2][0] = "102";
        Learn3DArray.pizza[0][2][1] = "Pineapple";
        Learn3DArray.pizza[0][2][2] = "45";
        Learn3DArray.pizza[0][2][3] = "2";
        Learn3DArray.pizza[0][2][4] = "90";

        Learn3DArray.pizza[0][3][0] = "103";
        Learn3DArray.pizza[0][3][1] = "Meat Lover";
        Learn3DArray.pizza[0][3][2] = "55";
        Learn3DArray.pizza[0][3][3] = "3";
        Learn3DArray.pizza[0][3][4] = "165";

        Learn3DArray.pizza[0][4][0] = "104";
        Learn3DArray.pizza[0][4][1] = "covered pizza";
        Learn3DArray.pizza[0][4][2] = "65";
        Learn3DArray.pizza[0][4][3] = "5";
        Learn3DArray.pizza[0][4][4] = "325";

        Learn3DArray.pizza[1][5][0] = "104";
        Learn3DArray.pizza[1][5][1] = "covered pizza";
        Learn3DArray.pizza[1][5][2] = "65";
        Learn3DArray.pizza[1][5][3] = "5";
        Learn3DArray.pizza[1][5][4] = "325";

        System.out.println("Pizza Info "+Learn3DArray.pizza[0][4][1]);

        for (String  pizz []    []: pizza){
            //convert 3D to 2D
            for (String piz [] : pizz){
                //convert 2D to 1D
                for (String pi : piz){
                    //get value from 1D
                    System.out.print(pi+" ");
                }

                System.out.println();

            }


        }

    }



}
