package by.epam_pre_training.task5.utils;

import by.epam_pre_training.task5.exceptions.EmptyArrayException;
import by.epam_pre_training.task5.exceptions.IllegalArrayLengthException;

public class Validator {

    public static void validateArrayLengthArgument(int length) throws IllegalArrayLengthException {

        if (length <= 0) {
            throw new IllegalArrayLengthException("The length of array "
                    + length
                    + " is negative or equals to zero!");
        }
    }


    public static <T> void validateArrayLength(MyList<T> array) throws EmptyArrayException {

        if ((array == null)
                || (array.size() == 0)) {
            throw new EmptyArrayException("The array is empty!");
        }
    }
}
