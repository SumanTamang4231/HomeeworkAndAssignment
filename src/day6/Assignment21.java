package day6;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {

                Scanner input=new Scanner(System.in);
                int days = input.nextInt();
                //passing variable to the switch
                switch (days)
                {
                    //comparing value of variable against each case
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;

                        case 4:
                    System.out.println("Wednesday");
                    break;
                    case 5:
                    System.out.println("Thursday");
                    break;
                    case 6:
                    System.out.println("Friday");
                    break;
                    case 7:
                        System.out.println("saturday");
                        break;

                }
            }
        }


