package by.epam_pre_training.task1;

public class MeanCalculator {
    private final static int TENS = 10;
    private final static int AMOUNT_OF_DIGITS = 6;

    public static double getArithmeticMean(int n) {
        n = Math.abs(n);

        double sum = n % TENS
                + (n /= TENS) % TENS
                + (n /= TENS) % TENS
                + (n /= TENS) % TENS
                + (n /= TENS) % TENS
                + (n / TENS) % TENS;
        return sum / AMOUNT_OF_DIGITS;
    }

    public static double getGeometricMean(int n) {
        n = Math.abs(n);

        double mult = n % TENS
                * ((n /= TENS) % TENS)
                * ((n /= TENS) % TENS)
                * ((n /= TENS) % TENS)
                * ((n /= TENS) % TENS)
                * ((n / TENS) % TENS);
        return Math.exp(Math.log(mult)/AMOUNT_OF_DIGITS);
    }
}
