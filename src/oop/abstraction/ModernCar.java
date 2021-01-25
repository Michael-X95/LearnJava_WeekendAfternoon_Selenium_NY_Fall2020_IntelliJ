package oop.abstraction;

public abstract class ModernCar {

    // abstract class: which is not fully abstract

    String modernCarBrand="Audi";
    double modernCarSuggestedPrice=75000;

    // Abstract method
    public abstract void cameras();
    public abstract void autoLaneControl();
    public abstract void selfDriven();
    public abstract void autoPark();
    public abstract void gps();
    public abstract void emergencyBreak();


    // static and non static methods are allowed here
    public void remoteStart(){
        System.out.println("Modern Car has Remote start feature");
    }

    public static void dualClimateControl(){
        System.out.println("Modern Car has dual Climate Control feature");
    }









}