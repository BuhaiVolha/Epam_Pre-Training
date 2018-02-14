package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PrimeChecker {

    public static boolean checkIfPrime(int number) throws NotNaturalNumberException {
        boolean isPrime = false;
        int squareRoot = (int)Math.sqrt(number);
        
        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

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
