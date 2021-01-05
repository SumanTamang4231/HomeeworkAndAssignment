package day2;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please input the radius");
        int r = input1.nextInt();

        double area1 = 3.14 * (r * r);
        System.out.println("The area of the circle is " + area1);

    }
}
