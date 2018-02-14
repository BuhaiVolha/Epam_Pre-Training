package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class TheLargestDigitFinder {

    public static int findLargestDigit(int naturalNumber) throws NotNaturalNumberException {
        int largestDigit = 0;
        int digit;

        if (naturalNumber <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

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
