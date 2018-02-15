package by.epam_pre_training.task1;

public class SumAndMultCalculator {

    public static int countSumOfDigits(int n) {
        n = Math.abs(n);

        return n % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n / 10) % 10;
    }

    public static int countMultOfDigits(int n) {
        n = Math.abs(n);

        return n % 10
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n / 10) % 10);
    }
}
