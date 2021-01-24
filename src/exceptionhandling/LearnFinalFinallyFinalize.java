package exceptionhandling;

public class LearnFinalFinallyFinalize {

    // What is Final, finally, Finalize?
    // Garbage collection: Finalize
    // Finalize is used to perform clean up processing just before object is garbage collected.
    static final int NUMBER= 24;
    String name ="Farhana";
    String address;


    public static void main(String[] args) {

        // number=25;

        LearnFinalFinallyFinalize lf1= new LearnFinalFinallyFinalize();
        lf1.doDivision(44,0);

        LearnFinalFinallyFinalize lf2= new LearnFinalFinallyFinalize();
        lf2.name="Kate";

        LearnFinalFinallyFinalize lf3= new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf4= new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf5= new LearnFinalFinallyFinalize();

        System.gc();

    }

    public int doDivision(int num1, int num2){
        // Exception Handling
        int result = 0;
        System.out.println("We are learning");

        try {
            result= num1/num2;
            System.out.println("Division value is "+result);
        } catch (Exception exception){
            //exception.printStackTrace();
            System.out.println("This is Arithmetic Exception. Value should be non Zero");
        }
        finally {
            System.out.println("We are learning");
            System.out.println("hello");
            int total = num1+num2;
            System.out.println("Total value "+total);
        }
        return result;
    }



}