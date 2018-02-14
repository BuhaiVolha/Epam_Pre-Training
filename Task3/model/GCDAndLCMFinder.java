package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class GCDAndLCMFinder {

    public static int countGreatestCommonDivisor(int a, int b) throws NotNaturalNumberException {

        validate(a, b);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int countLeastCommonMultiply(int a, int b) throws NotNaturalNumberException {

        validate(a, b);

        return a / countGreatestCommonDivisor(a, b) * b;
    }
}
