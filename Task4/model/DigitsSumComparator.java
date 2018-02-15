package by.epam_pre_training.task4.model;

import static by.epam_pre_training.task4.validator.Validator.*;
import by.epam_pre_training.task4.exceptions.NotPositiveNumberException;

public class DigitsSumComparator {

    public static boolean equals(int n, int s) throws NotPositiveNumberException {

        validateIfPositive(n, s);

        if (n != 0) {
            s -= n % 10;
            n /= 10;
            return (equals(n, s));
        } else {
            return s == 0;
        }
    }

    public static boolean equalsIterative(int n, int s) throws NotPositiveNumberException {

        validateIfPositive(n, s);

        while (n != 0) {
            s -= n % 10;
            n /=10;
        }
        return s == 0;
    }
}
