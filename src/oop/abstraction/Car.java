package oop.abstraction;

public interface Car {

    //Interface: Interface is a guideline for future/ Proto type design for your reference so that
    // the development team can follow this to develop a complete product.

    // Interface is 100% Abstract

    // in Interface we can not declare variable but we can declare and assign value during creating variable
    // we can not create method with body but we can declare a method without body.

    String carName="Toyota";
    String price="23000";

    // Variable
    String brand="Mercedes";
    int carQuantity=200;
    String sear ="2";
    String headLight="4";
    boolean gasTank=true;

    // Method Declare: Abstract
    public void startCar();
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerationCar();
    public void steeringCar();
    public void brakeCar();
    public void navigation();


    public static int carDoor(int doorNumber){
        int totalDoor= 1*doorNumber;
        System.out.println("Total Door "+totalDoor);
        return totalDoor;
    }




    public interface NewCar{
        public void carRoof();

    }






}