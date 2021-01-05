package day3;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in);
        System.out.println("Please input the load on pounds ");

        double weight = input.nextDouble();
        System.out.println(" Converting the pounds into kg");

        double weight1= weight/2.025;
        System.out.println("The weight on the kilogram is "+ weight1);


    }
}
