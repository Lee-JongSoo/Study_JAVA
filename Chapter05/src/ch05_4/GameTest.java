package ch05_4;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<가위 바위 보 게임>>");
        System.out.println();

        Game[] pick = new Game[3];
        pick[0] = new Game();
        pick[1] = new Game();
        pick[2] = new Game();
        pick[0].setHands("가위");
        pick[1].setHands("바위");
        pick[2].setHands("");

        while(true) {
            System.out.print("가위(1) 바위(2) 보(3) 종료(0)입력 : ");
            int playerHands = sc.nextInt();

            int computerHands= 0;
            computerHands = (int)(Math.random()*3+1);

            if(playerHands == 0){
                System.out.println("수고했습니다!");
                System.out.println("by 2017250035 이종수");
                break;
            }
            System.out.println();
            System.out.println("Coputer Value : " + pick[computerHands-1].getHands());
            System.out.print("컴퓨터가 " + pick[computerHands-1].getHands() + "를 냈습니다.");

            if (playerHands - computerHands == 1 || playerHands - computerHands == -2) {
                System.out.println("당신이 이겼습니다.");
                System.out.println();
            } else if (playerHands - computerHands == 0) {
                System.out.println("당신과 비겼습니다.");
                System.out.println();
            } else if (playerHands - computerHands == -1 || playerHands - computerHands == 2){
                System.out.println("당신이 졌습니다.");
                System.out.println();
            }
        }
    }
}
