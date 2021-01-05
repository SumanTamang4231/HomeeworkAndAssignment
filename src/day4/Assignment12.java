package day4;

import javax.swing.*;

public class Assignment12 {
    public static void main(String[] args) {
        int roll= Integer.parseInt(JOptionPane.showInputDialog("Please input the roll number :"));
        String name= JOptionPane.showInputDialog("Please input the name :");
        String nationality = JOptionPane.showInputDialog("Please input the nationality");

        JOptionPane.showMessageDialog(null," The person with roll number "+ roll + "has a name "+name +"and a nationality is "+ nationality );
    }

}
