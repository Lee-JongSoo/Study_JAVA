package gameLevel;

public class MainBoard {
    public static void main(String[] args){
        Player player = new Player();
        player.play(1);

        AdvencedLevel advencedLevel = new AdvencedLevel();
        player.upgradeLevel(advencedLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}
