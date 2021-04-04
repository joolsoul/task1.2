package ru.vsu.kudinov.gui.tabs;

import ru.vsu.kudinov.common.Vector;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ProductOfVectorByNumber extends Tab
{
    private JLabel labelVector = new JLabel("Enter coordinates of the vector:");
    private JLabel labelNumber = new JLabel("Enter the number:");
    private JTextField fieldNumber = new JTextField();
    private JLabel labelResult = new JLabel("The product of the vector by number:");

    public ProductOfVectorByNumber()
    {
        setLayout(null);
        setFont(font);
        setBackground(color);

        addElements(100, labelVector, labelFirstX, labelFirstY, labelFirstZ, fieldFirstX, fieldFirstY, fieldFirstZ);

        labelNumber.setBounds(130, 150, 140, 20);
        add(labelNumber);

        fieldNumber.setBounds(240, 150, 75, 20);
        add(fieldNumber);

        addElements(200, labelResult, labelResultX, labelResultY, labelResultZ, fieldResultX, fieldResultY, fieldResultZ);

        fieldResultX.setEditable(false);
        fieldResultY.setEditable(false);
        fieldResultZ.setEditable(false);

        calculateButton.setBounds(325, 150, 95, 20);
        calculateButton.addActionListener(performActionCalcButtonListener());
        add(calculateButton);

        clearButton.setBounds(425, 150, 95, 20);
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
            fieldNumber.setText(null);
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
            Vector vector = new Vector(Integer.parseInt(fieldFirstX.getText()), Integer.parseInt(fieldFirstY.getText()), Integer.parseInt(fieldFirstZ.getText()));
            Vector resultVector = vector.calculateProductOfVectorByNumber(Double.parseDouble(fieldNumber.getText()));
            fieldResultX.setText(Double.toString(resultVector.getX()));
            fieldResultY.setText(Double.toString(resultVector.getY()));
            fieldResultZ.setText(Double.toString(resultVector.getZ()));
        };
    }
}
