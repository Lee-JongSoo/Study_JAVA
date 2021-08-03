package gameLevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("run very fast");
    }

    @Override
    public void jump() {
        System.out.println("Super Jump");
    }

    @Override
    public void turn() {
        System.out.println("Turn arround");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** Super Level *****");
    }
}
