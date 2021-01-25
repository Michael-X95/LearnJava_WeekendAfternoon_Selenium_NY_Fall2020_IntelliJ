package oop.encapsualtion;

public class TestMobile {


    public static void main(String[] args) {

       Mobile mobile = new Mobile();

       mobile.setIosOfDevice("APPLE");
        System.out.println(mobile.getIosOfDevice());

       mobile.setColorOfDevice("Blue");
        System.out.println(mobile.getColorOfDevice());

        mobile.setPrice(800);
        System.out.println(mobile.getPrice());

        mobile.setSize('6');
        System.out.println(mobile.getSize());

        mobile.setAvailable(true);
        System.out.println(mobile.isAvailable());
    }
}
