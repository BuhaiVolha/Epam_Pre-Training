package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PrimeChecker {

    public static boolean checkIfPrime(int number) throws NotNaturalNumberException {
        
        validate(number);
        
        boolean isPrime = false;
        int squareRoot = (int)Math.sqrt(number);
        
        if ((number != 1) && ((number & 1) != 0)) {
            for (int i = 3; i < squareRoot; i += 2) {
                if ((number % i) == 0) {
                    break;
                }
            }
            isPrime = true;
        }
        return isPrime;
    }
}
