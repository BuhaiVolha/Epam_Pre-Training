package by.epam_pre_training.task8.utils;

import by.epam_pre_training.task8.exceptions.EmptyArrayException;

public class Validator {

    public static <E> void validateArray(E[] array) throws EmptyArrayException {

        if ((array == null)
                || (array.length == 0)) {
            throw new EmptyArrayException("The array is empty!");
        }
    }
}
