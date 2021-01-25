package oop.abstraction;

public class GeneralMotor implements Car{
    // Concrete class
    String brand="GM"; // ReAssign

    String carModel="M23";
    String modelYear="2023";
    static double price=700000;
    int gmCarQty;

    public static void carInfo(){
        System.out.println("This is General Motor car information");
    }

    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }


    public void startCar() {
        System.out.println("GeneralMotor car has start feature");
    }

    public void stopCar() {
        System.out.println("GeneralMotor car has stop feature");
    }

    public void wheelCar() {
        System.out.println("GeneralMotor car has wheel");
    }

    public void engineCar() {
        System.out.println("GeneralMotor car has Engine");
    }

    public void accelerationCar() {
        System.out.println("GeneralMotor car has Acceleration feature");
    }

    public void steeringCar() {
        System.out.println("GeneralMotor car has steering");
    }

    public void brakeCar() {
        System.out.println("GeneralMotor car has brake feature");
    }

    public void navigation() {
        System.out.println("GeneralMotor car has navigation feature");
    }


}