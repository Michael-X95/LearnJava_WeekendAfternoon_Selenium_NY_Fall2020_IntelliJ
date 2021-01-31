package datastructureandalgorithm.array;

public class LearnArray {


    // Variable Declare and Assign:
    String name = "James";
    // Declare variable
    String address;


    // Array: which can hold multiple value of a same data type
    // DataType [] variableName = new DataType[numberOfVariables]
    // Declare Array with length
    static String[] students = new String[6];  // 40byte x6 = 240 byte

    String[] addresses = new String[7];

    int [] stId ={ 501,502,505,606,707,404,909};

    public static void main(String[] args) {
        LearnArray.students[0] = "Jack";
        LearnArray.students[1] = "John";
        LearnArray.students[2] = "Bob";
        LearnArray.students[3] = "Yasmina";
        LearnArray.students[4] = "Bill";
        LearnArray.students[5] = "Trump";

        System.out.println("Student name " + LearnArray.students[5]);

        LearnArray learn = new LearnArray();
        learn.addresses[0] = "NY";
        learn.addresses[1] = "NJ";
        learn.addresses[2] = "FL";
        learn.addresses[3] = "TX";
        learn.addresses[4] = "MI";
        learn.addresses[5] = "CO";
        learn.addresses[6] = "CA";
        System.out.println("Student Address " + learn.addresses[4]);
        try {
            learn.addresses[7] = "VA";
            System.out.println(learn.addresses[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }


        int[] numbers = new int[10];
        numbers[0] = 101;
        numbers[1] = 102;
        numbers[2] = 103;
        numbers[3] = 104;
        numbers[4] = 105;
        System.out.println("Numbers " + numbers[3]);

        for (int i=0; i<numbers.length; i++){
            System.out.println("Numbers are "+numbers[i]);
        }

        System.out.println("***********  Students Name ");
        for (int i=0; i<LearnArray.students.length; i++){
            System.out.println("Students Names are "+LearnArray.students[i]);
        }


        System.out.println("******** For Each Loop *********");
        // For Each Loop
        // for( DataType variableName : arrayName){   }
        for (String st : learn.addresses){
            System.out.println("Student Addresses are "+st);
        }


        System.out.println("******** Array Declare and Assign value *********");
        System.out.println(learn.stId[4]);

        double salary [] ={5000.5, 7000.6, 8000.8, 9000.9};
        System.out.println(salary[2]);

        // How to retrieve all the value using for each loop
        for (double sa: salary){
            System.out.println("Salary is "+sa);
        }


    }


}