
package ru.vsu.kudinov.gui;

import javax.swing.*;

public class FrameMain
{
    private JFrame frame;

    public FrameMain()
    {
        frame = new JFrame("Interface");
        ImageIcon icon = new ImageIcon("src\\ru\\vsu\\kudinov\\resources\\icon.jpg");
        frame.setIconImage(icon.getImage());
        frame.setSize(670, 400);
        frame.add(new TabbedPane());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
