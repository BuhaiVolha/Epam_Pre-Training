package by.epam_pre_training.task4.model;

public class RaiserToPower {

    public static double pow(double a, int b) {

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

        return (b == 0) ? 1
                : (b == 2) ? a * a
                : ((b & 1) == 1) ? powRecursive(a,b - 1) * a
                : powRecursive(a, b >> 1) * powRecursive(a, b >> 1);
    }
}
