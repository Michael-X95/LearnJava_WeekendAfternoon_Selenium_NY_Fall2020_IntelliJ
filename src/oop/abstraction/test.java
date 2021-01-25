package oop.abstraction;

public class test {


    public static void main(String[] args) {
        GeneralMotor gm= new GeneralMotor();
        gm.startCar();
        gm.stopCar();
        //gm.brand="BMW"; // as value is final in Interface
        System.out.println(gm.brand);
        Car.carDoor(2);
        System.out.println(Car.brand);

        Tesla tesla= new Tesla();
        tesla.startCar();
        tesla.accelerationCar();
        tesla.engineCar();

        tesla.flyingCarFeature();
        tesla.brakeCar();
        tesla.steeringCar();
        tesla.teslaCarInfo();
        tesla.carRoof();
        tesla.emergencyBreak();
        tesla.boostEngine();




    }




}