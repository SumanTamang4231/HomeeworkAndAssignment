package takeoutproject;

import java.util.Scanner;

public class TakeOutMain {


    public static int people;
    public static int feed;
    public static int trays;
    public static void main(String[] args) {
        System.out.println("Please enter the number of People to start the order");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x < 10 || x > 100) {
            System.out.println("Invalid ,Less order");
        } else {
            people = x;
            displayMainMenu();
        }
    }
    public static void displayMainMenu(){
            int icon;
            System.out.println("Please choose one of the food Option");
            System.out.println("1.Italian Food Menu");
            System.out.println("2.Chinese Food Menu");
            System.out.println("3.American Food Menu");

            Scanner input1 = new Scanner(System.in);
                icon =input1.nextInt();


                switch(icon){
                    case 1:
                        System.out.println("Here is the Italian Menu");
                        Restaurant.ItalianFoodMenu(people);
                        break;

                    case 2:
                        System.out.println("Here is the Chinese Menu ");
                        Restaurant.ChineseFoodMenu(people);
                        break;

                    case 3:
                        System.out.println("Here is the American Menu");
                        Restaurant.AmericanFoodMenu(people);
                        break;
                    case 4 :
                        System.out.println("Invalid Option");
                        displayMainMenu();
                        return;


                }
        }
        public void determineTrays(int peoples, int feeds){



            this.people =peoples;
            this.feed = feeds;
        }





}
