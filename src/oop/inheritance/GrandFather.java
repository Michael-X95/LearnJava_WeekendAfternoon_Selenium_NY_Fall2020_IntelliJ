package oop.inheritance;

public class GrandFather {

    // Variable
    public String grandFatherFavoriteDish = "Fish";
    public String grandFatherFavoriteSport = "Soccer";
    public String grandFatherFavoriteSSN = "465468561";

    private String grandFatherAccountNumber;

    public GrandFather() {
    }

    public GrandFather(String grandFatherFavoriteDish, String grandFatherFavoriteSport, String grandFatherFavoriteSSN) {
        this.grandFatherFavoriteDish = grandFatherFavoriteDish;
        this.grandFatherFavoriteSport = grandFatherFavoriteSport;
        this.grandFatherFavoriteSSN = grandFatherFavoriteSSN;
    }

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    public void fishing() {
        System.out.println("GrandFather loves to go fishing");
    }

    public void height() {
        System.out.println("GrandFather height is 6'2");
    }

    public void weight() {
        System.out.println("GrandFather weight is 225LB");
    }

    public void jump() {
        System.out.println("GrandFather can jump");
    }

    public void playGame() {
        System.out.println("GrandFather loves to playGames");
    }

    public void bloodGroup() {
        System.out.println("GrandFathers blood group is A");
    }

    public void tellStories() {
        System.out.println("GrandFather loves to tell stories");
    }

    public void loveAnimals() {
        System.out.println("GrandFather loves animals");
    }


}
