package by.epam_pre_training.task4.validator;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;
import by.epam_pre_training.task4.exceptions.NotPositiveNumberException;
import by.epam_pre_training.task4.exceptions.NumberEqualsZeroException;

public class Validator {

    public static void validateIfNatural(int... number) throws NotNaturalNumberException {

        for (int a : number) {
            if (a <= 0) {
                throw new NotNaturalNumberException("The number is not a natural number");
            }
        }
    }


    public static void validateIfPositive(int... number) throws NotPositiveNumberException {

        for (int a : number) {
            if (a < 0) {
                throw new NotPositiveNumberException("The number is not a positive number");
            }
        }
    }


    public static void validateIfZero(double... number) throws NumberEqualsZeroException {

        for (double a : number) {
            if (a == 0) {
                throw new NumberEqualsZeroException("The number is equal to 0");
            }
        }
    }
}
