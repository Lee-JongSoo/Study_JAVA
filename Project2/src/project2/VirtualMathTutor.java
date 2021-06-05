/*
Author : Lee Jong Soo
E-mail : jongsu2645@gmail.com
Course : Java Web Programming
Assignment : Programming Assignment Project2 : Virtual Math Tutor
Due Date : 05/31/2021
File : VirtualMathTutor.java
Purpose : To create a GUI-based Java application that helps elementary school students learn the mathematical operations of addition, subtraction, and multiplication.
Compiler/IDE : Java SE Development Kit 8u181/IntelliJ IDEA
Operating System : MAC OS
*/
package project2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VirtualMathTutor {
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTextField answerField;
    private int result;  //연산의 결과를 저정하기 위한 변수 선언
    private int count = 1; //틀린 횟수를 저장하기 위한 변수 초기화

    public void go(){
        frame = new JFrame("Math Tutor!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); //구성요소를 순서대로 배치

        frame.add(new JLabel("How much is " + generateProblem()));
        label = new JLabel("Please enter your answer");
        frame.add(label);
        answerField = new JTextField(2);
        answerField.addActionListener(new myActionListener());
        frame.add(answerField);

        button = new JButton("New Problem");
        frame.add(BorderLayout.SOUTH,button);
        button.addActionListener(new NewProblemListener());

        frame.setSize(250, 200);
        frame.setVisible(true);
    }

    public class NewProblemListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            count = 1;
            go();
        }
    }

    public class myActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if(answerField.getText().equals(String.valueOf(result))){
                label.setText("Very good! It only took you " + count + " try.");
                frame.add(label);
            }else{
                count++;
                label.setText("I'm sorry, but no. Please try again.");
                frame.add(label);
            }
        }
    }

    /** This method that starts by generating a random integer in the range 1 to 3,
     * randomly selects one of three operations,
     * generates two random integers in the range 1 to 10 for the operands,
     * and prints the result.
     * @return String
     */
    public String generateProblem(){
        String str = "";
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int num3 = (int) (Math.random() * 3 + 1);
        switch (num3){
            case 1: result = num1 + num2; str = "Plus";  break;
            case 2: result = num1 - num2;  str = "Minus"; break;
            case 3: result = num1 * num2;  str = "Times"; break;
            default: break;
        }
        return (num1 + " " + str + " " + num2 + "?");
    }

    public static void main(String[] args){
        VirtualMathTutor mathTutor = new VirtualMathTutor();
        mathTutor.go();
        System.out.println("by 2017250035 이종수");
    }
}
