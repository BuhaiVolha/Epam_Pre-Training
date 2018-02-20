package by.epam_pre_training.task5.validator;

import by.epam_pre_training.task5.exceptions.NotPositiveNumberException;

public class Validator {

    public static void validateIfPositive(int... numbers) throws NotPositiveNumberException {

        for (int number : numbers) {
            if (number < 0) {
                throw new NotPositiveNumberException(number + " is not a positive number!");
            }
        }
    }
}
