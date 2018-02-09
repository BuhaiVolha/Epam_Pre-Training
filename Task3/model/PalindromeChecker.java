package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;
import static by.epam_pre_training.task3.constants.Constants.*;

public class PalindromeChecker {

    public static boolean isPalindrome(int number) throws NotNaturalNumberException {
        int temp = number;
        int reversedNumber = 0;
        int digit;

        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

        while (temp != 0) {
            digit = temp % TENS;
            reversedNumber = reversedNumber * TENS + digit;
            temp = temp / TENS;
        }
        return number == reversedNumber;
    }


    public static boolean isPalindromeWithString(int naturalNumber) throws NotNaturalNumberException {
        String number = Integer.toString(naturalNumber);
        int numberLength = number.length() - 1;
        boolean isPalindrom = true;

        if (naturalNumber <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

        for (int i = 0, j = numberLength; i < j; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
