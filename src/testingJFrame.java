package src;

import javax.swing.*;
import java.awt.*;

public class testingJFrame {

    public static void main(String[] args) {
        //JFrame is basically a window, labels are elements added to the window.
        JFrame frame = new JFrame("Testing image with overlaying text.");
        //need to figure out how to place the images such that you don't need the absolute path.
        JLabel label = new JLabel(new ImageIcon("C:\\Users\\Salwa\\Desktop\\GIT CODES\\House-Rules-Uno\\src\\i.png"));
        frame.setLayout(new FlowLayout());

        frame.setBackground(Color.white);
        frame.setSize(700, 800);
        frame.add(label);

        //need to figure out how to center this.
        JLabel text = new JLabel("1");
        text.setFont(new Font("Arial", Font.PLAIN,75));

        frame.add(text);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when the program is exited, JFrame will
        //close as well.

        frame.setVisible(true); //making the frame visible so it shows up.
    }
}