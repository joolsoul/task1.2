package ru.vsu.kudinov.gui.tabs;

import ru.vsu.kudinov.common.Vector;
import javax.swing.*;
import java.awt.event.ActionListener;

public class LengthOfVector extends Tab
{
    private JLabel labelVector = new JLabel("Enter coordinates of the vector:");
    private JLabel labelResult = new JLabel("The length of the vector:");

    public LengthOfVector()
    {
        setLayout(null);
        setFont(font);
        setBackground(color);

        addElements(100, labelVector, labelFirstX, labelFirstY, labelFirstZ, fieldFirstX, fieldFirstY, fieldFirstZ);

        labelResult.setBounds(155, 150, 140, 20);
        add(labelResult);

        fieldResult.setBounds(300, 150, 185, 20);
        fieldResult.setEditable(false);
        add(fieldResult);

        calculateButton.setBounds(215, 200, 95, 20);
        calculateButton.addActionListener(performActionCalcButtonListener());
        add(calculateButton);

        clearButton.setBounds(315, 200, 95, 20);
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
            fieldResult.setText(null);
        };
    }

    @Override
    ActionListener performActionCalcButtonListener()
    {
        return e ->
        {
            Vector vector = new Vector(Integer.parseInt(fieldFirstX.getText()), Integer.parseInt(fieldFirstY.getText()), Integer.parseInt(fieldFirstZ.getText()));
            fieldResult.setText(Double.toString(vector.calculateLengthOfVector()));
        };
    }
}
