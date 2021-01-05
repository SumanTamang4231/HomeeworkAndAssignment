package day4;

import javax.swing.*;

public class Assignment13 {
    public static void main(String[] args) {
        double number = Double.parseDouble(JOptionPane.showInputDialog("Please input the number "));

        if (number > 0) {
            JOptionPane.showMessageDialog(null, "Number is not negative ");

        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, "The number is " + number);
        }
    }
}
