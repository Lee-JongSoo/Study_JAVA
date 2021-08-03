package gameLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("slow run");
    }

    @Override
    public void jump() {
        System.out.println("I can't do");
    }

    @Override
    public void turn() {
        System.out.println("I can't do");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** Beginner Level *****");
    }
}
