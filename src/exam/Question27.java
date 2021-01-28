package exam;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        int a,b;
        int sum = 0;
        int Multip = 1;
        System.out.println("Enter the number");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();//22




        while (a>0) {
            b = a % 10;
            sum = sum + b;
            Multip = Multip * b;
            a = a / 10;
        }

        System.out.println("The sum of the number is "+sum);

        System.out.println("The mulitply of the number is "+Multip);
    }

 }

