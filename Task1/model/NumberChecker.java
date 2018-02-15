package by.epam_pre_training.task1;

public class NumberChecker {

    public static boolean checkIfRising(int n) {
        n = Math.abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i);
    }

    public static boolean checkIfDecreasing(int n) {
        n = Math.abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i);
    }
}
