package oop.inheritance;

public class Test {


    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.fishing();
        gf.getGrandFatherAccountNumber();
        gf.height();


        Father father = new Father();
        father.jump();
        father.eyes();
        father.beard();
        father.goodPersonality();

        Son son = new Son();
        son.playGame();
        son.eyes();
        son.goodPersonality();
        son.student();

        Daughter daughter = new Daughter();
        daughter.tellStories();
        daughter.hairColor();
        daughter.shopping();
        daughter.singing();

    }
}
