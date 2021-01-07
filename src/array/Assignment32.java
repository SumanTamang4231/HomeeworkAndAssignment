package array;

import java.util.Scanner;

public class Assignment32 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the number");
            arr[i] = input.nextInt();

        }

        double sum = arr.length;
        System.out.println("The sum of the number of array are " + sum);

    }
}