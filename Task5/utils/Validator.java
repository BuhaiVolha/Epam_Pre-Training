package by.epam_pre_training.task5.utils;

import by.epam_pre_training.task5.exceptions.EmptyArrayException;
import by.epam_pre_training.task5.exceptions.NotPositiveNumberException;

public class Validator {

    public static void validateIfPositive(int... numbers) throws NotPositiveNumberException {

        for (int number : numbers) {
            if (number < 0) {
                throw new NotPositiveNumberException(number + " is not a positive number!");
            }
        }
    }


    public static <T> void checkIfArrayIsEmpty(MyList<T> array) throws EmptyArrayException {

        if (array.isEmpty()) {
            throw new EmptyArrayException("The array is empty!");
        }
    }
}
