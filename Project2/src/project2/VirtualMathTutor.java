package project2;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class VirtualMathTutor {
    private int count = 0;
    public static void main(String[] args){
        VirtualMathTutor mathTutor = new VirtualMathTutor();
        mathTutor.go();
    }
    public void go(){
        JFrame frame = new JFrame("Math Tutor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("New Problem");
        frame.getContentPane().add(button);

        JLabel label = new JLabel();
        label.setText("Please enter your answer ");
        frame.add(label);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
