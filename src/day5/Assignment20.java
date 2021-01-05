package day5;

import javax.swing.*;
import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
      double first=Double.parseDouble(JOptionPane.showInputDialog("Enter the number one ")) ;
      double second=Double.parseDouble(JOptionPane.showInputDialog("Enter the numbertwo"));


      Scanner input=new Scanner(System.in);
      char operator = input.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}


