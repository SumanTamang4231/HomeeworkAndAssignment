package day1;
import java.util.Scanner;


public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principal amount ");
        int p = input.nextInt();
        System.out.println("Please enter the time");
        int t = input.nextInt();
        System.out.println("Please enter the time ");
        int r = input.nextInt();

        int interest=(p*t*r)/100;
        System.out.println("The interest amount is " + interest);

    }
}
