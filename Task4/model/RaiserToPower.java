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
  
    public static double powIterative(double base, int exponent) {
        double result = 1.0;
        int exponentWorkingVal = Math.abs(exponent);
        double baseWorkingVal = base;

        while (exponentWorkingVal > 0) {
            if ((exponentWorkingVal & 1) == 1) {
                result *= baseWorkingVal;
            }

            exponentWorkingVal >>= 1;
            baseWorkingVal *= baseWorkingVal;
        }

        return (exponent > 0) ? result 
                : 1.0 / result;
    }
}
