package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class LargestDigitFinder {

    public static int findLargestDigit(int naturalNumber) throws NotNaturalNumberException {
        
        validate(naturalNumber);
       
        int largestDigit = 0;
        int digit;

        while (naturalNumber > 0) {
            digit = naturalNumber % 10;

            if (digit > largestDigit) {
                largestDigit = digit;
            }
            naturalNumber /= 10;
        }
        return largestDigit;
    }
}
