package day5;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

    }
}
