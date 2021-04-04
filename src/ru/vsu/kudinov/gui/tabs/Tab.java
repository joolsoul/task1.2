package ru.vsu.kudinov.gui.tabs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class Tab extends JPanel
{
     Font font = new Font("SanSerif", Font.BOLD, 12);
     Color color = new Color(97, 248, 170);
     JLabel labelFirstVector = new JLabel("Enter coordinates of the first vector:");
     JLabel labelFirstX = new JLabel("x:");
     JLabel labelFirstY = new JLabel("y:");
     JLabel labelFirstZ = new JLabel("z:");
     JTextField fieldFirstX = new JTextField();
     JTextField fieldFirstY = new JTextField();
     JTextField fieldFirstZ = new JTextField();
     JLabel labelSecondVector = new JLabel("Enter coordinates of the second vector:");
     JLabel labelSecondX = new JLabel("x:");
     JLabel labelSecondY = new JLabel("y:");
     JLabel labelSecondZ = new JLabel("z:");
     JTextField fieldSecondX = new JTextField();
     JTextField fieldSecondY = new JTextField();
     JTextField fieldSecondZ = new JTextField();
     JLabel labelResultX = new JLabel("x:");
     JLabel labelResultY = new JLabel("y:");
     JLabel labelResultZ = new JLabel("z:");
     JTextField fieldResultX = new JTextField();
     JTextField fieldResultY = new JTextField();
     JTextField fieldResultZ = new JTextField();
     JTextField fieldResult = new JTextField();
     JButton calculateButton = new JButton("Calculate");
     JButton clearButton = new JButton("Clear");

    void addElements(int y, JLabel labelName, JLabel labelX, JLabel labelY, JLabel labelZ, JTextField fieldX, JTextField fieldY, JTextField fieldZ)
    {
        labelName.setBounds(105, y, 225, 13);
        add(labelName);

        labelX.setBounds(105 + 230, y - 2, 10, 15);
        add(labelX);

        fieldX.setBounds(105 + 250, y - 3, 50, 20);
        add(fieldX);

        labelY.setBounds(105 + 310, y - 2, 10, 15);
        add(labelY);

        fieldY.setBounds(105 + 330, y - 3, 50, 20);
        add(fieldY);

        labelZ.setBounds(105 + 390, y - 2, 10, 15);
        add(labelZ);

        fieldZ.setBounds(105 + 410, y - 3, 50, 20);
        add(fieldZ);
    }

    abstract ActionListener performActionClearButtonListener();

    abstract ActionListener performActionCalcButtonListener();
}
