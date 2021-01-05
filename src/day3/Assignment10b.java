package day3;

import javax.swing.*;

public class Assignment10b {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the a :"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Please enter the b : "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Please enter the c :"));

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        JOptionPane.showMessageDialog(null,"the area is : "+ area );
    }
}
