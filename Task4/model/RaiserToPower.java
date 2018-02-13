package by.epam_pre_training.task4.model;

import by.epam_pre_training.task4.exceptions.NotRealNumberException;

public class RaiserToPower {

    public static double pow(double a, int b) throws NotRealNumberException {

        if (a == 0) {
            throw new NotRealNumberException("The number"
                    + a + " is not real!");
        }

        if (b > 0) {
            return powRecursive(a, b);
        } else {
            return 1 / powRecursive(a, Math.abs(b));
        }
    }

    private static double powIterative(double a, int b) {
        double result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }

            b >>= 1;
            a *= a;
        }
        return result;
    }


    private static double powRecursive(double a, int b) {
        double result

        if (b == 0) {
            return 1;
        }

        if (b == 2) {
            return a * a;
        }

        if ((b & 1) == 1) {
            return powRecursive(a, b - 1) * a;
        } else {
            result = powRecursive(a, b >> 1);
            return result * result;
        }
    }
}
