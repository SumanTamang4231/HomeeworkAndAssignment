package day6;

import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
  int num,count ,total=0;
        System.out.println("Please enter number of the natural number ");
        Scanner input=new Scanner(System.in);
        num =input.nextInt();

        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);

    }
}
