package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PerfectNumberChecker {

    public static boolean checkIfPerfect(int number) throws NotNaturalNumberException {
        
        validate(number);
        
        int sum = 1;
        int top = number / 2;

        for (int i = 2; i <= top; i++) {
            if ((number % i) == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
