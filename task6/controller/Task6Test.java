package by.epam.buhai.task6.controller;

import by.epam.buhai.task6.model.Logic;
import static by.epam.buhai.task6.view.View.*;

public class Task6Test {

    public static void main(String[] args) {

        try {
            String s = "anna";
            print(Logic.checkIfPalindrome(s));

        } catch (Exception e) {
            print(e.getMessage());
        }
    }
}
