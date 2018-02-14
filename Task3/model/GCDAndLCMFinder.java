package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class GCDAndLCMFinder {

    public static int countGreatestCommonDivisor(int a, int b) throws NotNaturalNumberException {

        if ((a <= 0) || (b <= 0)) {
            throw new NotNaturalNumberException("The numbers are not natural numbers");
        }

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

        if ((a <= 0) || (b <= 0)) {
            throw new NotNaturalNumberException("The numbers are not natural numbers");
        }

        return a / countGreatestCommonDivisor(a, b) * b;
    }
}
