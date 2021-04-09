package ch06_1;
import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] main) {
        ArrayList<String> locations = new ArrayList<String>();
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5);

        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));
        locations.add((Integer.toString(randomNum+2)));
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
        System.out.println("by 2017250035 이종수");
    }
}
