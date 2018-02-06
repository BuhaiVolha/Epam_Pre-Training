package by.epam_pre_training.task1;

import java.util.Scanner;

public class View {

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

    public static String inputLine(String msg){
        print(msg);
        return new Scanner(System.in).nextLine();
    }
}
