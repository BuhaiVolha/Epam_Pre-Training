package by.epam_pre_training.task4.model;

import static by.epam_pre_training.task4.constants.Constants.*;

public class SumOfDigitsFinder {

    public static int findDigitsSumIterative(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % TENS;
            number /= TENS;
        }
        return sum;
    }


    public static int findDigitsSumRecursive(int number) {

        return (number == 0) ? 0
                : number % TENS
                + findDigitsSumRecursive(number / TENS);
    }
}
