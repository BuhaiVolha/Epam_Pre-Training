package by.epam_pre_training.task4.controller;

import static by.epam_pre_training.task4.validator.Validator.validateIfNatural;
import static by.epam_pre_training.task4.validator.Validator.validateIfPositive;
import static by.epam_pre_training.task4.validator.Validator.validateIfZero;
import by.epam_pre_training.task4.exceptions.NotNaturalNumberException;
import by.epam_pre_training.task4.exceptions.NotPositiveNumberException;
import by.epam_pre_training.task4.exceptions.NumberEqualsZeroException;
import static by.epam_pre_training.task4.view.View.*;
import by.epam_pre_training.task4.model.*;

public class Task4Test {

    public static void main(String[] args) {

        // Task 1

        int number = 112358;
        int digitsSum = SumOfDigitsFinder.findDigitsSumRecursive(number);

        print("The number is "
                + number
                + ", the sum of digits is "
                + digitsSum);

        // Task 2

        double a = 2.4;
        int b = -2;

        try {
            validateIfZero(a);
            double pow = RaiserToPower.pow(a,b);

            System.out.printf(a + " raised to a power of "
                    + b + " equals to %.5f\n", pow);

        } catch (NumberEqualsZeroException e) {
            print("The base must not be equal to 0!");
        }

        // Task 3

        int n = 1234567;
        int s = 28;

        try {
            validateIfPositive(n, s);
            boolean isEqual = DigitsSumComparator.equals(n, s);

            print("The sum of digits of " + n
                    + " is "
                    + ((isEqual) ? "equal" : "not equal")
                    + " to " + s);
        } catch (NotPositiveNumberException e) {
            print(e.getMessage());
        }

        // Task 4

        int position = -5;
        int fibonacciMember = FibonacciNumbersCounter.countNthFibonacciNumber(position);

        print("The " + position
                + " member of Fibonacci sequence is "
                + fibonacciMember);

        // Task 5

        int ringsAmount = 3;
        char source = 'A';
        char receiver = 'B';
        char temp = 'C';

        try {
            validateIfNatural(ringsAmount);

            HanoiTower.moveTower(ringsAmount, source, receiver, temp);
        } catch (NotNaturalNumberException e) {
            print("The tower must consist of at least 1 ring!");
        }

    }
}
