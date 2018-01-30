package epam_homework.epam2;

import java.util.Scanner;

public class Printer {

    public static void print(String msg) {
        System.out.println(msg);
    }
    public static void printThere(String msg) {
        System.out.print(msg);
    }
    public static int inputInt(String msg){
        print(msg);
        return new Scanner(System.in).nextInt();
    }
}
