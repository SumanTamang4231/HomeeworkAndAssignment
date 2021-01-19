package lab;

import java.util.Scanner;

public class BankAccount {
    public String name;
    public double initialBalance;
    public int accountNumber = 1;
    public double amount;
    public double fee;

    public void displayPage() {
        double rate;
        int icon;


        System.out.println("Welcome to National Bank");
        System.out.println("Please choose one of the option");
        System.out.println("1.Withdraw the quick Cash");
        System.out.println("2.Check the Account Balance ");
        System.out.println("3.Deposit the money");
        System.out.println("4.No transaction at all");
        Scanner input = new Scanner(System.in);
        icon = input.nextInt();


        switch (icon) {
            case 1:
                System.out.println("Enter the amount of money to withdraw");
                amount = input.nextDouble();
                fee = 5;
                withdrawfund(amount, fee);
                break;

            case 2:
                System.out.println("The account Balance is " + initialBalance);
                break;

            case 3:
                System.out.println("Enter the amount of money to deposit ");
                double amt = input.nextDouble();
                rate = 5;
                depositfund(amt, rate);
                break;

            case 4:
                System.out.println("Please visit us Next Time,Take your Card");
                break;

        }
    }


    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.initialBalance = initialBalance;
        this.accountNumber++;
    }

    public void withdrawfund ( double amount, double fee){
        this.amount = this.initialBalance - amount - fee;
        if(this.initialBalance < this.amount){
            System.out.println("Withdraw amount is greater than Available balance");
            return;
        }
        this.amount = amount;
         displayBalance();
    }

    public void depositfund ( double amount, double interestRate){
        this.initialBalance = this.initialBalance + amount + (initialBalance * interestRate / 100);
        System.out.println("The total deposit amount is :" + amount);
        System.out.println("Yor Current Balance is : " + this.initialBalance);
    }

    private void displayBalance(){
        System.out.println("Withdraw Fund is :" + this.amount);
        System.out.println("Withdraw Fee is :" + this.fee);
        System.out.println("Total deducted Amount :" + (this.initialBalance - this.amount - this.fee));
        this.initialBalance = this.initialBalance - this.amount - this.fee;
        System.out.println("Remaining Balance :" + this.initialBalance);
    }

}

