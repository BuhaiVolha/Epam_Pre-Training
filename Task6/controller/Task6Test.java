package by.epam_pre_training.task6.controller;

import by.epam_pre_training.task6.model.Logic;
import static by.epam_pre_training.task6.view.View.*;

public class Task6Test {

    public static void main(String[] args) {

        String s = "detartrated";

        try {
            print(Logic.checkIfPalindrome(s));
        } catch (Exception e) {
            print(e.getMessage());
        }
    }
}
