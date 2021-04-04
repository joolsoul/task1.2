package ru.vsu.kudinov.gui;

import ru.vsu.kudinov.gui.tabs.*;
import javax.swing.*;

public class TabbedPane extends JTabbedPane
{
    public TabbedPane()
    {
        add("Length", new LengthOfVector());
        add("Sum", new SumOfVectors());
        add("Difference", new DifferenceOfVectors());
        add("Vector product", new VectorProductOfVectors());
        add("Scalar product", new ScalarProductOfVectors());
        add("Product by number", new ProductOfVectorByNumber());
        add("Projection", new ProjectionOfVector());
        add("Cos", new CosBetweenVectors());
    }
}
