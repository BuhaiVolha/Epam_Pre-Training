package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;
import static by.epam_pre_training.task3.validator.Validator.*;

public class TheLargestDigitFinder {

    public static int findLargestDigit(int naturalNumber) throws NotNaturalNumberException {

        validate(naturalNumber);

        int largestDigit = naturalNumber % 10;

        while ((naturalNumber > 0) && (largestDigit != 9)) {
            largestDigit = ((naturalNumber /= 10) % 10) > largestDigit
                            ? naturalNumber % 10
                            : largestDigit;
        }
        return largestDigit;
    }
}
