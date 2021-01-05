package day3;

import javax.swing.*;

public class Assignment10a {
    public static void main(String[] args) {

        double u= Double.parseDouble(JOptionPane.showInputDialog("Enter u: "));
        double t= Double.parseDouble(JOptionPane.showInputDialog("Enter t: "));
        double a= Double.parseDouble(JOptionPane.showInputDialog("Please input the a :"));

        double s = u*t +  0.5 * a *t*t;
        JOptionPane.showMessageDialog(null, "Speed is " + s);
}
}
