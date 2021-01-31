package oop.polymorphism.methodoverriding;

import oop.abstraction.ModernCar;

public class Bmw extends ModernCar {
    // Override Annotation



    @Override
    public void cameras() {

    }

    @Override
    public void autoLaneControl() {

    }

    @Override
    public void selfDriven() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void gps() {

    }


    public void emergencyBreak() {

    }


    public void camera360() {

    }
    public void camera360(String cameraName) {
        System.out.println(cameraName);
    }

    @Override
    public void remoteStart(){
        System.out.println("BMW car has remote start feature");
    }




}