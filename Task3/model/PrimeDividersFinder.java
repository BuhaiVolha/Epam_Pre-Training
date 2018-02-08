package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

import java.util.ArrayList;
import java.util.List;

public class PrimeDividersFinder {

    public static List<Integer> findPrimeDividers(int number) throws NotNaturalNumberException{
        List<Integer> primes = new ArrayList<>();

        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

        while ((number & 1) == 0) {
            primes.add(2);
            number >>= 1;
        }

        for (int i = 3; i < number / i; i += 2) {
            if (number % i == 0) {
                primes.add(i);
                number /=i;
            }
        }

        if (number > 1) {
            primes.add(number);
        }
        return primes;
    }
}
