package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PalindromeChecker {

    public static boolean checkIfPalindrome(int number) throws NotNaturalNumberException {
        
        validate(number);
        
        int temp = number;
        int reversedNumber = 0;

        while (temp != 0) {
            reversedNumber = reversedNumber * 10 + temp % 10;
            temp = temp / 10;
        }
        return number == reversedNumber;
    }


    public static boolean checkIfPalindromeWithString(int naturalNumber) throws NotNaturalNumberException {
        
        validate(naturalNumber);
        
        String number = Integer.toString(naturalNumber);
        int numberLength = number.length() - 1;
        boolean isPalindrom = true;

        for (int i = 0, j = numberLength; i < j; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
