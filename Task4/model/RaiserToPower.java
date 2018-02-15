package by.epam_pre_training.task4.model;

public class RaiserToPower {

    // recursive approach
    
    public static double powRecursive(double base, int exponent) {

        return (exponent < 0) ? 1.0 / powRecursive(base, -exponent)
                : (exponent == 0) ? 1
                : (exponent == 1) ? base
                : (exponent == 2) ? base * base
                : ((exponent & 1) == 1) ? powRecursive(base,exponent - 1) * base
                : powRecursive(base, exponent >> 1)
                * powRecursive(base, exponent >> 1);
    }
    
    
    // iterative approach
  
    public static double pow(double a, int b) {

        if (b > 0) {
            return powIterative(a, b);
        } else {
            return 1 / powIterative(a, -b);
        }
    }

    private static double powIterative(double a, int b) {
        double result = 1.0;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }

            b >>= 1;
            a *= a;
        }
        return result;
    }
}
