package by.epam_pre_training.task1;

public class SumAndMultCalculator {
    private final static int TENS = 10;

    public static int getSumOfDigits(int n) {
        n = Math.abs(n);

        return n % TENS
                + (n /= TENS) % TENS
                + (n /= TENS) % TENS
                + (n /= TENS) % TENS
                + (n / TENS) % TENS;
    }

    public static int getMultOfDigits(int n) {
        n = Math.abs(n);

        return n % TENS
                * ((n /= TENS) % TENS)
                * ((n /= TENS) % TENS)
                * ((n /= TENS) % TENS)
                * ((n / TENS) % TENS);
    }
}
