package ru.vsu.kudinov.gui.tabs;

import ru.vsu.kudinov.common.Vector;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SumOfVectors extends Tab
{

    private JLabel labelResult = new JLabel("The sum of the vectors:");

    public SumOfVectors()
    {
        setLayout(null);
        setFont(font);
        setBackground(color);

        addElements(100, labelFirstVector, labelFirstX, labelFirstY, labelFirstZ, fieldFirstX, fieldFirstY, fieldFirstZ);
        addElements(150, labelSecondVector, labelSecondX, labelSecondY, labelSecondZ, fieldSecondX, fieldSecondY, fieldSecondZ);
        addElements(200, labelResult, labelResultX, labelResultY, labelResultZ, fieldResultX, fieldResultY, fieldResultZ);

        fieldResultX.setEditable(false);
        fieldResultY.setEditable(false);
        fieldResultZ.setEditable(false);

        calculateButton.setBounds(225, 250, 95, 20);
        calculateButton.addActionListener(performActionCalcButtonListener());
        add(calculateButton);

        clearButton.setBounds(325, 250, 95, 20);
        clearButton.addActionListener(performActionClearButtonListener());
        add(clearButton);
    }

    @Override
    ActionListener performActionClearButtonListener()
    {
        return e ->
        {
            fieldFirstX.setText(null);
            fieldFirstY.setText(null);
            fieldFirstZ.setText(null);
            fieldSecondX.setText(null);
            fieldSecondY.setText(null);
            fieldSecondZ.setText(null);
            fieldResultX.setText(null);
            fieldResultY.setText(null);
            fieldResultZ.setText(null);
        };
    }

    @Override
    ActionListener performActionCalcButtonListener()
    {
        return e ->
        {
            Vector firstVector = new Vector(Integer.parseInt(fieldFirstX.getText()), Integer.parseInt(fieldFirstY.getText()), Integer.parseInt(fieldFirstZ.getText()));
            Vector secondVector = new Vector(Integer.parseInt(fieldSecondX.getText()), Integer.parseInt(fieldSecondY.getText()), Integer.parseInt(fieldSecondZ.getText()));
            Vector resultVector = firstVector.calculateSumOfVectors(secondVector);
            fieldResultX.setText(Double.toString(resultVector.getX()));
            fieldResultY.setText(Double.toString(resultVector.getY()));
            fieldResultZ.setText(Double.toString(resultVector.getZ()));
        };
    }
}
