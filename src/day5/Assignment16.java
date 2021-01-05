package day5;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();

        if (number%2 == 0){
            System.out.println("The" +number+ "number is even");
        }
        else {
            System.out.println("The " + number + "number is odd");
        }
    }
}
