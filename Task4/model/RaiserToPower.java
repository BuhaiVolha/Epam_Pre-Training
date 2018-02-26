package by.epam_pre_training.task4.model;

public class RaiserToPower {

    // recursive approach
    
    public static double powRecursive(double a, int b) {
        
        if (b > 0) {
            return a * powRecursive(a, b - 1);
        }
        
        if (b < 0) {
            return (1 / a) * powRecursive(a, b + 1);
        }
        
        return 1;
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
