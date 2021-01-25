package oop.encapsualtion;

public class TestPizza {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        //pizza.pizzaName

        // When you create getter and setter first we create Getter method then Setter method
        // When you use getter and setter first we set value then get value

        pizza.setToppingName("Mushroom"); // set value or Assign value
        System.out.println(pizza.getToppingName()); // get value

        pizza.setAvailable(false);
        System.out.println(pizza.isAvailable());






    }




}