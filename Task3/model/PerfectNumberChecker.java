package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PerfectNumberChecker {

    public static boolean checkIfPerfect(int number) throws NotNaturalNumberException {
        int sum = 1;
        int top = number / 2;

        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }


        for (int i = 2; i <= top; i++) {
            if ((number % i) == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
