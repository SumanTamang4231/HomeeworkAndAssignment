package day2;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature1 = input.nextInt();

        double temperature =  (temperature1 -32)/1.8 ;
        System.out.println(" The temperature in the celius is "+ temperature);
    }
}
