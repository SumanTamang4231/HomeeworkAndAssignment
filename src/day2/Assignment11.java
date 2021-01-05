package day2;

import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int p = a + b + c;
        System.out.println(" The perimeter of the triangle is " + p);
    }
}
