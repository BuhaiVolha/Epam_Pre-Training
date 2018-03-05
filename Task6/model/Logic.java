package by.epam_pre_training.task6.model;

import by.epam_pre_training.task6.exceptions.Task6Exception;
import by.epam_pre_training.task6.model.containers.stack.AbstractStack;
import by.epam_pre_training.task6.model.containers.stack.StackFixedSizeArrayBased;

public class Logic {

    public static boolean checkIfPalindrome(String word) throws Task6Exception {
        word = word.toLowerCase();
        boolean isPalindrome = true;

        // pushing in first half of the word
        int wordLength = word.length() / 2;
        AbstractStack<Character> stack = new StackFixedSizeArrayBased<>(wordLength);
        for (int i = 0; i < wordLength; i++) {
            stack.push(word.charAt(i));
        }

        // checking starting from the middle
        int j = ((word.length() & 1) == 0) ? wordLength : wordLength + 1;
        while (!stack.isEmpty() && isPalindrome) {
            if (stack.pop() != word.charAt(j++)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
