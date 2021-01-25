package oop.abstraction;

public class Tesla extends FlyingCar implements Car,AutoPilot {
    // Concrete class
    // A class can implements multiple interface at a time but can extends a class at time only.

    String teslaCarModel="T45";
    double teslaCarT45Price=100000;

    public void teslaCarInfo(){
        System.out.println("Tesla Car Information");
    }

    public void startCar() {
        System.out.println("Tesla car has start feature");
    }

    public void stopCar() {
        System.out.println("Tesla car has stop feature");
    }

    public void wheelCar() {
        System.out.println("Tesla car has wheel");
    }

    public void engineCar() {
        System.out.println("Tesla car has Engine");
    }

    public void accelerationCar() {
        System.out.println("Tesla car has Acceleration feature");

    }

    public void steeringCar() {
        System.out.println("Tesla car has steering feature");
    }

    public void brakeCar() {
        System.out.println("Tesla car has brake feature");
    }

    public void navigation() {
        System.out.println("Tesla car has navigation feature");

    }

    public void cameras() {
        System.out.println("Tesla car has cameras feature");
    }

    public void autoLaneControl() {
        System.out.println("Tesla car has autoLaneControl feature");
    }

    public void selfDriven() {
        System.out.println("Tesla car has self Driven feature");
    }

    public void autoPark() {
        System.out.println("Tesla car autoPark feature");
    }

    public void gps() {
        System.out.println("Tesla car has gps feature");
    }

    public void emergencyBreak() {
        System.out.println("Tesla car has emergencyBreak feature");
    }

    public void autoPilot() {
        System.out.println("Tesla car has autoPilot feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla car has largeDisplay feature");
    }

    public void boostEngine() {
        System.out.println("Tesla car has boostEngine feature");
    }


    public void carRoof() {
        System.out.println("Tesla car has carRoof feature");
    }

    public void flyingCarFeature() {
        System.out.println("Tesla car has flyingCarFeature feature");
    }


}