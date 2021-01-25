package oop.inheritance;

public class Father extends GrandFather {

    // Variable
    public String fatherFavoriteDish = "Chicken";
    public String fatherFavoriteSport = "Tennis";
    public String fatherFavoriteSSN = "465468551";

    private String fatherAccountNumber;

    public Father() {
    }

    public Father(String fatherFavoriteDish, String fatherFavoriteSport, String fatherFavoriteSSN) {
        this.fatherFavoriteDish = fatherFavoriteDish;
        this.fatherFavoriteSport = fatherFavoriteSport;
        this.fatherFavoriteSSN = fatherFavoriteSSN;
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    public void swim() {
        System.out.println("Father can swim");
    }

    public void beard() {
        System.out.println("Father has nice beard");
    }

    public void hairColor() {
        System.out.println("Fathers hair color is black");

    }

    public void eyes() {
        System.out.println("Fathers eyes are blue");

    }

    public void goodPersonality() {
        System.out.println("Father has good personality");
    }


}
