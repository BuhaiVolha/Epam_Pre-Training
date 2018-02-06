package by.epam_pre_training.task1;

public class NumberReverser {
    private final static int TENS = 10;

    public static int reverseNum(int n) {
        n = Math.abs(n);
        int reversed = n % TENS;

        reversed = reversed * TENS + ((n /= TENS) % TENS);
        reversed = reversed * TENS + ((n /= TENS) % TENS);
        reversed = reversed * TENS + ((n /= TENS) % TENS);
        reversed = reversed * TENS + ((n /= TENS) % TENS);
        reversed = reversed * TENS + ((n /= TENS) % TENS);
        reversed = reversed * TENS + ((n / TENS) % TENS);

        return reversed;
    }
}
