package ch13_3;

import java.awt.*;
import javax.swing.*;

public class SlotMachine {
    JPanel mainPanel;
    JFrame theFrame;

    public static void main(String[] args){
        new SlotMachine().buildGUI();
    }

    public void buildGUI(){
        theFrame = new JFrame("My Game");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
