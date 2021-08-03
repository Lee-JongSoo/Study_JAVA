package gameLevel;

public class AdvencedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void jump() {
        System.out.println("High Jump");
    }

    @Override
    public void turn() {
        System.out.println("I can't do");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** Advanced Level *****");
    }
}
