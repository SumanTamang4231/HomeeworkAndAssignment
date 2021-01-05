package day3;

import javax.swing.*;

public class Assignment11 {
    public static void main(String[] args) {
        double b= Double.parseDouble(JOptionPane.showInputDialog("Please input the b "));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Please input the a :"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Please input the c :"));

        double x = (-b + Math.sqrt(b*b -4*a*c))/2*a;
        JOptionPane.showMessageDialog(null,"The value of the x is :" + x);
    }
}
