package oop.inheritance;

public class Daughter extends Father {

    // Variable
    public String daughterFavoriteDish = "Shrimp";
    public String daughterFavoriteSport = "Badminton";
    public String daughterFavoriteSSN = "465488571";

    private String daughterAccountNumber;

    public Daughter() {
    }

    public Daughter(String daughterFavoriteDish, String daughterFavoriteSport, String daughterFavoriteSSN) {
        this.daughterFavoriteDish = daughterFavoriteDish;
        this.daughterFavoriteSport = daughterFavoriteSport;
        this.daughterFavoriteSSN = daughterFavoriteSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void dancing() {
        System.out.println("Daughter loves to dance");

    }

    public void singing() {
        System.out.println("Daughter is very good at singing");

    }

    public void learning() {
        System.out.println("Daughter is a fast learner");

    }

    public void shopping() {
        System.out.println("Daughter LOVES shopping");

    }

    public void flyOnTheSky() {
        System.out.println("Daughters dream is to be able to fly");

    }


}
