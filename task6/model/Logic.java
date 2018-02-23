package by.epam.buhai.task6.model;

import by.epam.buhai.task6.exceptions.StackEmptyException;
import by.epam.buhai.task6.exceptions.StackOverflowException;

public class Logic {

    public static boolean checkIfPalindrome(String s) throws StackOverflowException, StackEmptyException {
        AbstractMyStack<Character> string = new MyStackArray<>();

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

