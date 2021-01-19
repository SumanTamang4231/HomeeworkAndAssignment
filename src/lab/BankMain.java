package lab;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        int icon;
        BankAccount account;

        System.out.println("Welcome to National Bank");
        System.out.println("Please choose one of the option");
        System.out.println("1. Create a bank account with name");
        System.out.println("2. Create a bank account with name and balance to deposit");

            Scanner input=new Scanner(System.in);
            icon=input.nextInt();

            String name;
            double balance;
            switch (icon){
                case 1:
                    System.out.println("Enter the name  of the person");
                    name =input.next();
                    balance = 0;
                    account= new BankAccount(name, balance);
                    account.displayPage();
                    break;

                case 2:
                    System.out.println("Enter the name of the person");
                    name = input.next();
                    System.out.println("Enter the amount for the balance ");
                    balance =input.nextDouble();
                    account=new BankAccount(name, balance);
                    account.displayPage();
                    break;

                default: System.out.println("Incorrect Option");
                break;

        }
    }
}
