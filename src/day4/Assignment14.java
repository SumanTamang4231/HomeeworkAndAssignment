package day4;

import javax.swing.*;

public class Assignment14 {
    public static void main(String[] args) {
        double number1=Double.parseDouble(JOptionPane.showInputDialog("Please input the number 1"));
        double number2=Double.parseDouble(JOptionPane.showInputDialog("Please input the number 2"));

        if (number1==number2)
        {
            JOptionPane.showMessageDialog(null,"The" + number1+ " is equal to "+ number2);
        }
        else if (number1>number2)
        {
            JOptionPane.showMessageDialog(null,"The"+number1+">"+number2);
        }
    }
}
