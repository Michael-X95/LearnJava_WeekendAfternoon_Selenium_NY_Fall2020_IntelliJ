package oop.inheritance;

public class Son extends Father {

    // Variable
    public String sonFavoriteDish = "Beef";
    public String sonFavoriteSport = "Handball";
    public String sonFavoriteSSN = "465468571";

    private String sonAccountNumber;

    public Son() {
    }

    public Son(String sonFavoriteDish, String sonFavoriteSport, String sonFavoriteSSN) {
        this.sonFavoriteDish = sonFavoriteDish;
        this.sonFavoriteSport = sonFavoriteSport;
        this.sonFavoriteSSN = sonFavoriteSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void student() {
        System.out.println("Son is a Quality Engineer student");
    }

    public void player() {
        System.out.println("Son is a handball player");
    }

    public void hiking() {
        System.out.println("Son loves hiking");
    }

    public void hairStyle() {
        System.out.println("Son has a mohawk");
    }

    public void bodyBuilder() {
        System.out.println("Son is a professional body builder");
    }



}
