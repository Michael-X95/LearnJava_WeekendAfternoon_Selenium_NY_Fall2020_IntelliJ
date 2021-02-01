package datastructureandalgorithm.array;

public class Learn2DArray {


    //2D Array:

    //dataType [1st dimension] [2nd dimension] variable = new dataType [row] [column];
public static String [][] carInfo ={
            {"carbrand","carModel","carColor,","carPrice","carYear"},
            {"Tesla","Model X","Red","110000","2021"},
            {"BMW","X8","Black","90000","2020"},
            {"Audi","A5","Blue","200000","2021"}
    };


    public static void main(String[] args) {

        System.out.println("Car Info "+carInfo[2][2]);

        String[][] stName = new String[6][4];

        System.out.println(stName.length);

        stName[0][0] = "sl";
        stName[0][1] = "firstName";
        stName[0][2] = "lastName";
        stName[0][3] = "address";

        stName[1][0] = "101";
        stName[1][1] = "James";
        stName[1][2] = "William";
        stName[1][3] = "Manhattan, NY";

        stName[2][0] = "102";
        stName[2][1] = "Jack";
        stName[2][2] = "Cohen";
        stName[2][3] = "Queens, NY";

        stName[3][0] = "103";
        stName[3][1] = "Easha";
        stName[3][2] = "Khanam";
        stName[3][3] = "Sitka,Alaska";

        stName[4][0] = "104";
        stName[4][1] = "Amar";
        stName[4][2] = "Alilli";
        stName[4][3] = "Denver,CO";


        try {
            stName[5][0] = "105";
            stName[5][1] = "Parisa";
            stName[5][2] = "Khosravi";
            stName[5][3] = "Irvine, CA";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        System.out.println("Student name " + stName[4][1]);
        System.out.println("Student name " + stName[5][1]);

// How to retrieve all the value fom a 20 Array?
        for (String stn[] : stName) {
            //concert 2D to 1D by adding [] after stn

            for (String st : stn) {
                System.out.print(st + " ");

            }
            System.out.println();
        }

    }
}
