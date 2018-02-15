package by.epam_pre_training.task1;

public class MeanCalculator {
    private final static int AMOUNT_OF_DIGITS = 6;

    public static double getArithmeticMean(int n) {
        n = Math.abs(n);

        double sum = n % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n / 10) % 10;
        return sum / AMOUNT_OF_DIGITS;
    }

    public static double getGeometricMean(int n) {
        n = Math.abs(n);

        double mult = n % 10
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n / 10) % 10);
        return Math.exp(Math.log(mult)/AMOUNT_OF_DIGITS);
    }
}
