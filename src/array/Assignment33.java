package array;

import java.util.Scanner;

public class Assignment33 {
    public static void main(String[] args) {


        int a,b;

        //User inputs the array size
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        a = input.nextInt();

        int num[] = new int[a];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a; i++)
        {
            num[i] = input.nextInt();
        }

        for (int i = 0; i < a; i++)
        {
            for (int j = i + 1; j < a; j++) {
                if (num[i] > num[j])
                {
                    b = num[i];
                    num[i] = num[j];
                    num[j] = b;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < a - 1; i++)
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[a - 1]);
    }
}