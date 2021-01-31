package string;

public class LearnString {
    // String is a data type
    // String is a class
    // String is a sequence of character


    String name = "James";

    public static void main(String[] args) {

        String food = "couscous";
        System.out.println(food.length());
        System.out.println(food.equals("Couscous"));
        System.out.println(food.equals("couscous"));
        System.out.println(food.equalsIgnoreCase("cOusCous"));
        System.out.println(food.charAt(5));
        char charCompare = food.charAt(5);
        String name = "James";
        System.out.println(food.substring(3));
        System.out.println(food.substring(4,7));
        System.out.println(food.toLowerCase());
        System.out.println(food.toUpperCase());


        String stId="101";
        String lName="William";
        System.out.println(stId.concat(lName));

        // Exception Handling

        try {
            System.out.println(food.charAt(10));
        } catch (Exception e){
            System.out.println("String Index Out Of Bounds Exception");
        }

        // Reverse String
        // Remove
        // Trim
        System.out.println(food.contains("p"));



    }


}