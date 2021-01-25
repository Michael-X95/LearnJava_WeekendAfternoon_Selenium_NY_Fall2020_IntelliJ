package oop.encapsualtion;

public class Mobile {

    public String mobileName;

    private String iosOfDevice;
    private int price;
    private char size;
    private String colorOfDevice;
    private boolean isAvailable;

    public Mobile(){
    }

    public String getIosOfDevice() {
        return iosOfDevice;
    }

    public void setIosOfDevice(String iosOfDevice) {
        this.iosOfDevice = iosOfDevice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColorOfDevice() {
        return colorOfDevice;
    }

    public void setColorOfDevice(String colorOfDevice) {
        this.colorOfDevice = colorOfDevice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
