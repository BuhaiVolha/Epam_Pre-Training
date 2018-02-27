package by.epam_pre_training.task6.model;

import by.epam_pre_training.task6.model.stack.AbstractMyStack;
import by.epam_pre_training.task6.model.stack.MyStackFixedSizeArray;

public class Logic {

    public static boolean checkIfPalindrome(String s) {
        s = s.toLowerCase();
        AbstractMyStack<Character> string = new MyStackFixedSizeArray<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            string.push(s.charAt(i));
        }

       String reversedString = "";

        while(!string.isEmpty()) {
            reversedString += string.pop();
        }
        return s.equals(reversedString);
    }
}
