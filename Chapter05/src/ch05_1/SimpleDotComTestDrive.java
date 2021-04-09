package ch05_1;

public class SimpleDotComTestDrive {
    public static void main(String[] main) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        System.out.println("by 2017250035 이종수");
    }
}

