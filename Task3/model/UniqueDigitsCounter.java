package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class UniqueDigitsCounter {

    public static int countUniqueDigits(int number) throws NotNaturalNumberException {
        
        validate(number);
        
        String uniqueDigits = "";
        int digit;

        if (number != 0) {
            while (number > 0) {
                digit = number % 10;
                if (!uniqueDigits.contains(digit + "")) {
                    uniqueDigits += digit;
                }
                number /= 10;
            }
        } else {
            uniqueDigits = "0";
        }
        return uniqueDigits.length();
    }
}
