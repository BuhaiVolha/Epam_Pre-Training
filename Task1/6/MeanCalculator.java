package epam_homework.epam1;

import static java.lang.Math.pow;

public class MeanCalculator {

    public static void main(String[] args) {
        // the number must consist of 6 digits
        int number = 658432;

        System.out.printf("The arithmetic mean equals %.2f\n",
                MeanCalculatorLogic.getArithmeticMean(number));
        System.out.printf("The geometric mean equals %.2f",
                MeanCalculatorLogic.getGeometricMean(number));
    }
}

class MeanCalculatorLogic {

    public static double getArithmeticMean(int n) {
        n = Math.abs(n);

        double sum = n % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n / 10) % 10;
        return sum / 6;
    }

    public static double getGeometricMean(int n) {
        n = Math.abs(n);

        double mult = n % 10
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n / 10) % 10);
        return Math.exp(Math.log(mult)/6);
    }
}
