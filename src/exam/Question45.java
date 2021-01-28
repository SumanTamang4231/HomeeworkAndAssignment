package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question45 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("C:\\123.txt"));
        String name = "dropped";
        int cnt = 0;
        //String str = "my name is ram is ram ram";
//        String[] StringArry = str.split(name);
//        System.out.println();
//        if(StringArry.length > 1) System.out.println("count of word "+ name +"="+(StringArry.length)+" Duplicate");
//        else System.out.println("no Duplicagte");
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.indexOf(name) != -1){
                cnt++;
            }
        }
        if(cnt > 1) System.out.println("Duplicagte Count="+cnt);
        else System.out.println("No Word found");
    }

}
//write a program to find the duplicate name (word )in a file