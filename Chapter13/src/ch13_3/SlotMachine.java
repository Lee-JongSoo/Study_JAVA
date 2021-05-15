package ch13_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SlotMachine extends JFrame implements ActionListener{
    public static void main(String[] args){
        new SlotMachine();
        System.out.println("by 2017250035 이종수");
    }
    private JLabel[] labels;
    private JLabel totalLabels;
    private JButton button;
    int[] numbers;
    int total = 0;

    public SlotMachine(){
        setSize(500,600);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        labels = new JLabel[3];
        numbers = new int[3];
        Font bigFont = new Font("sanserif", Font.BOLD, 100);

        for(int i=0; i<3; i++){
            labels[i] = new JLabel("" + numbers[i]);
            labels[i].setFont(bigFont);

            labels[i].setSize(100,100);
            labels[i].setLocation(100+100*i, 20);
            panel.add(labels[i]);
        }

        totalLabels = new JLabel();
        Font bigFont2 = new Font("sanserif", Font.BOLD, 20);
        totalLabels.setFont(bigFont2);
        totalLabels.setSize(100, 50);
        totalLabels.setLocation(100, 210);
        panel.add(totalLabels);

        button = new JButton("스핀");
        button.setSize(300, 70);
        button.setLocation(100, 150);

        panel.add(button);
        button.addActionListener(this);
        add(panel);
        setTitle("My Game");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
        for(int i=0; i<3; i++){
            numbers[i] = (int) (Math.random()*10);
            labels[i].setText(" " + numbers[i]);
        }

        if(numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            total += 100;
        }
        totalLabels.setText(" " + total);
    }
}
