package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;
import static by.epam_pre_training.task3.constants.Constants.*;

public class UniqueDigitsCounter {

    public static int countUniqueDigits(int number) throws NotNaturalNumberException {
        String uniqueDigits = "";
        int digit;

        if (number != 0) {
            while (number > 0) {
                digit = number % TENS;
                if (!uniqueDigits.contains(digit + "")) {
                    uniqueDigits += digit;
                }
                number /= TENS;
            }
        } else {
            uniqueDigits = "0";
        }
        return uniqueDigits.length();
    }
}
