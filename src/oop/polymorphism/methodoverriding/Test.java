package oop.polymorphism.methodoverriding;

import oop.abstraction.Car;
import oop.abstraction.GeneralMotor;

public class Test {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.remoteStart();
        System.out.println(bmw.toString());

        Audi audi = new Audi();
        audi.remoteStart();

        System.out.println("*********************************************");

        // How to create a object?
        // className objectName = new constructorOfClass();
        GeneralMotor gm = new GeneralMotor();
        gm.startCar();

        Car myCar = new GeneralMotor();

        myCar.stopCar();
        myCar.startCar();
        //myCar.carInfo();
        (    (GeneralMotor)    myCar   ).carInfo();

        // ((GeneralMotor) myCar).carInfo();




    }


}