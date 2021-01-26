package takeoutproject;

import java.util.Scanner;

public class Restaurant {

    public static void ItalianFoodMenu(int people){
        Double price = 0.0;
        int feedCount = 0;
        System.out.println("Please pick one of the option from the Menu");
        System.out.println("1. Lasagna Tray - Feeds 5 - $17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - $15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - $12.99");
        Scanner input=new Scanner (System.in);
        int x=input.nextInt();
        if(x == 1) {
            price = 17.99;
            feedCount = people/5;
        }
        else if(x == 2) {
            price = 15.99;
            feedCount = people/7;
        }
        else if(x == 3) {
            price = 12.99;
            feedCount = people/4;
        }else {
            System.out.println("Error......");
            ItalianFoodMenu(people);
            return;
        }

        DetermineTray.runCalculate(feedCount,  price,  people);


    }

    public static void ChineseFoodMenu(int people) {
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - $18.99");
        System.out.println(" 2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - $18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - $10.99");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        Double price = 0.0;
        int feedCount = 0;
        if (x == 1) {
            price = 18.99;
            feedCount = people / 7;
        } else if (x == 2) {
            price = 18.99;
            feedCount = people / 7;
        } else if (x == 3) {
            price = 10.99;
            feedCount = people / 5;
        } else {
            System.out.println("Error......");
            ChineseFoodMenu(people);
            return;}

            DetermineTray.runCalculate(feedCount, price, people);


    }

    public static void AmericanFoodMenu(int people){
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - $21.99");
        System.out.println( "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - $22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - $26.99");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();

        Double price = 0.0;
        int feedCount = 0;
        if(x == 1) {
            price = 21.99;
            feedCount = people/8;
        }
        else if(x == 2) {
            price = 22.99;
            feedCount = people/5;
        }
        else if(x==3) {
            price = 26.99;
            feedCount = people/10;
        }else {
            System.out.println("Error......");
            ChineseFoodMenu(people);
            return;}

        DetermineTray.runCalculate(feedCount,  price,  people);


    }

}
