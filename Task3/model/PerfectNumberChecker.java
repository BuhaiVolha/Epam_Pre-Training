package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PerfectNumberChecker {

    public static boolean isPerfect(int number) throws NotNaturalNumberException {
        int sum = 0;
        int top = number / 2;

        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }


        for (int i = 1; i <= top; i++) {
            if ((number % i) == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isPerfect2(int number) throws NotNaturalNumberException {

        if (number <= 0) {
            throw new NotNaturalNumberException("The number is not a natural number");
        }

        return (number == 6) 
                || (number == 28)
                || (number == 496)
                || (number == 8128)
                || (number == 33550336);
    }
}
