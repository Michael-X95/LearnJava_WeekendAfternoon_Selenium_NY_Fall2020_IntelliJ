package singleton;

public class Pizza {

    String pizzaName;
    String toppingName;
    int qty;
    double price;

    public Pizza(){
        // Default constructor
    }


    public static void main(String[] args) {
        LearnSingleton learn= LearnSingleton.getInstance();
        System.out.println(learn.collegeName);


    }




}