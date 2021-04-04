package ru.vsu.kudinov.gui.tabs;

import ru.vsu.kudinov.common.Vector;
import javax.swing.*;
import java.awt.event.ActionListener;

public class CosBetweenVectors extends Tab
{

    private JLabel labelResult = new JLabel("The cosine between vectors:");

    public CosBetweenVectors()
    {
        setLayout(null);
        setFont(font);
        setBackground(color);

        addElements(100, labelFirstVector, labelFirstX, labelFirstY, labelFirstZ, fieldFirstX, fieldFirstY, fieldFirstZ);
        addElements(150, labelSecondVector, labelSecondX, labelSecondY, labelSecondZ, fieldSecondX, fieldSecondY, fieldSecondZ);

        labelResult.setBounds(155, 200, 175, 20);
        add(labelResult);

        fieldResult.setBounds(330, 200, 185, 20);
        fieldResult.setEditable(false);
        add(fieldResult);

        calculateButton.setBounds(235, 250, 95, 20);
        calculateButton.addActionListener(performActionCalcButtonListener());
        add(calculateButton);

        clearButton.setBounds(335, 250, 95, 20);
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
            fieldResult.setText(null);
        };
    }

    @Override
    ActionListener performActionCalcButtonListener()
    {
        return e ->
        {
            Vector firstVector = new Vector(Integer.parseInt(fieldFirstX.getText()), Integer.parseInt(fieldFirstY.getText()), Integer.parseInt(fieldFirstZ.getText()));
            Vector secondVector = new Vector(Integer.parseInt(fieldSecondX.getText()), Integer.parseInt(fieldSecondY.getText()), Integer.parseInt(fieldSecondZ.getText()));
            double cos = firstVector.calculateCos(secondVector);
            fieldResult.setText(Double.toString(cos));
        };
    }
}
