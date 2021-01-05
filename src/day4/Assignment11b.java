package day4;

import javax.swing.*;

public class Assignment11b {
    public static void main(String[] args) {
float first = 12.00f ,second = 24.00f;

JOptionPane.showMessageDialog(null,"Before Swap ");
JOptionPane.showMessageDialog(null," The First number is " + first );
JOptionPane.showMessageDialog(null,"The second number is "+ second);

        first = first - second;
        second = first + second;
        first = second - first;

        JOptionPane.showMessageDialog(null,"Before Swap ");
        JOptionPane.showMessageDialog(null," The First number is " + first );
        JOptionPane.showMessageDialog(null,"The second number is "+ second);
    }
}
