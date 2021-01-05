package day1;

import java.util.Scanner;

public class Assignement3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please input the number1");
        int number1 = input.nextInt();
        System.out.println("Please input the number2");
        int number2 = input.nextInt();

        int sum = number1+number2;
        System.out.println("The sum of the two number is "+sum);
        int avg = number1/number2;
        System.out.println("The average number of the two number is "+ avg);


    }
}
