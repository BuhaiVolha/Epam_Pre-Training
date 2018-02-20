package by.epam_pre_training.task5.view;

import by.epam_pre_training.task5.utils.MyList;

public class View {

    public static void print(Object object) {
        System.out.println(object);
    }


    public static void printThere(String msg) {
        System.out.print(msg);
    }


    public static <T> void printElementsOfArray(MyList<T> array) {

        for (T i : array) {
            print(i);
        }
    }
}
