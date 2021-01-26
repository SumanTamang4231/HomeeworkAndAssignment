package takeoutproject;

import java.util.Scanner;

public class DetermineTray {

    public static void runCalculate(int feedCount, Double price, int people){
        int y = trayCount(feedCount);
        DisplayPrice(y,  price,  people);
    }

    public static int trayCount(int feedCount){
        System.out.println("You need "+ feedCount +" trays");
        System.out.println(" Determine how many trays:");
        Scanner input = new Scanner(System.in);
       return input.nextInt();
    }

    public static void DisplayPrice(int trayCounts, Double price, int people){
        Double subTotal = trayCounts * price;
        Double tax = subTotal * 0.0825;
        Double tips = subTotal * 0.1;
        System.out.println("------Bill-------");
        System.out.println("Subtotal : " + subTotal);
        System.out.println("Tax : " + tax);
        System.out.println("Tips : "+ tips);
        System.out.println("----------------------");
        System.out.println("Total : "+(subTotal + tax + tips));
        System.out.println("----------------------");
        System.out.println("Total Per Person : "+(subTotal + tax + tips)/people);
    }

}
