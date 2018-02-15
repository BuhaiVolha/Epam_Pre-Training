package by.epam_pre_training.task1;

public class NumberReverser {

    public static int reverseNum(int n) {
        n = Math.abs(n);
        int reversed = n % 10;

        reversed = reversed * 10 + ((n /= 10) % 10);
        reversed = reversed * 10 + ((n /= 10) % 10);
        reversed = reversed * 10 + ((n /= 10) % 10);
        reversed = reversed * 10 + ((n /= 10) % 10);
        reversed = reversed * 10 + ((n /= 10) % 10);
        reversed = reversed * 10 + ((n / 10) % 10);

        return reversed;
    }
}
