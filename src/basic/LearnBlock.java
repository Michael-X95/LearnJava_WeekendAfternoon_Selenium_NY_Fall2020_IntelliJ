package basic;

public class LearnBlock {

    //Block
    {//block start point

        //Block body, everything inside the curly braces

        System.out.println("Hello");
        System.out.println("this is a block");
    }//block end point

    public static void display() {
        System.out.println("This is display method");

        {
            System.out.println("This is from inside of block");

            {
                System.out.println("Let's try block inside a block inside a block");
            }
        }

    }


    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("this is a block");
        LearnBlock.display();

    }


}
