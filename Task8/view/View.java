package by.epam_pre_training.task8.view;

import java.util.Arrays;

public class View {

    public static void print(Object obj) {
        System.out.println(obj);
    }


    public static void print(Object[] obj) {
        System.out.println(Arrays.toString(obj));
    }


    public static void printObj(Object[] obj) {
        for(Object o : obj) {
            System.out.println(o);
        }
    }
}
