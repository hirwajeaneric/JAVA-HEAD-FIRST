package LayoutManagers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C {
    JFrame frame;

    public static void main(String[] args) {
        //We create an object for our class and give it something to do.
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        //We create a JFrame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
