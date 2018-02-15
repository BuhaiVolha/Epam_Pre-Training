package by.epam_pre_training.task4.validator;

import by.epam_pre_training.task4.exceptions.NotNaturalNumberException;
import by.epam_pre_training.task4.exceptions.NotPositiveNumberException;
import by.epam_pre_training.task4.exceptions.NumberEqualsZeroException;

public class Validator {

    public static void validateIfNatural(int... numbers) throws NotNaturalNumberException {

        for (int number : numbers) {
            if (number <= 0) {
                throw new NotNaturalNumberException(number + " is not a natural number!");
            }
        }
    }


    public static void validateIfPositive(int... numbers) throws NotPositiveNumberException {

        for (int number : numbers) {
            if (number < 0) {
                throw new NotPositiveNumberException(number + " is not a positive number!");
            }
        }
    }


    public static void validateIfZero(double... numbers) throws NumberEqualsZeroException {

        for (double number : numbers) {
            if (number == 0) {
                throw new NumberEqualsZeroException(number + " is equal to 0!");
            }
        }
    }
}
