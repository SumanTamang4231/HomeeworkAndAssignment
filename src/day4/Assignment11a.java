package day4;

import javax.swing.*;

public class Assignment11a {
    public static void main(String[] args) {

        float first= 1.20f , second =2.45f;
        JOptionPane.showMessageDialog(null,"Before Swap");
        JOptionPane.showMessageDialog(null," First Number " + first );
        JOptionPane.showMessageDialog(null,"  Second Number "+ second);

        float temporary = first ;
         first = second ;

         second = first ;
         JOptionPane.showMessageDialog(null,"After Swap");
        JOptionPane.showMessageDialog(null," First Number " + first );
        JOptionPane.showMessageDialog(null,"  Second Number "+ second);
    }
}

