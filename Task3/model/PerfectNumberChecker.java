package by.epam_pre_training.task3.model;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class PerfectNumberChecker {
    private static final int FIRST_PERFECT_NUMBER = 6;
    private static final int SECOND_PERFECT_NUMBER = 28;
    private static final int THIRD_PERFECT_NUMBER = 496;
    private static final int FOURTH_PERFECT_NUMBER = 8128;
    private static final int FIFTH_PERFECT_NUMBER = 33_550_336;

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

        return (number == FIRST_PERFECT_NUMBER) 
                || (number == SECOND_PERFECT_NUMBER)
                || (number == THIRD_PERFECT_NUMBER)
                || (number == FOURTH_PERFECT_NUMBER)
                || (number == FIFTH_PERFECT_NUMBER);
    }
}
