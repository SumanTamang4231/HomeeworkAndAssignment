package day5;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an ASCII Code");
        int number = input.nextInt();

        System.out.println("The character for ASCII code "+ number+"is "+(char)number);
    }
}
