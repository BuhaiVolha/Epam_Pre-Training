package by.epam_pre_training.task4.model;

public class DigitsSumComparator {

    public static boolean equals(int n, int s) {

        if (n != 0) {
            s -= n % 10;
            n /= 10;
            return equals(n, s);
        } else {
            return s == 0;
        }
    }

    public static boolean equalsIterative(int n, int s) {
        
        while (n != 0) {
            s -= n % 10;
            n /=10;
        }
        return s == 0;
    }
}
