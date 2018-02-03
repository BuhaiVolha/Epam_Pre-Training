import static epam_Pre-Training.task1.Printer.print;
import static epam_Pre-Training.task1.Printer.printThere;

public class NumberChecker {

    public static void main(String[] args) {
        // the number must consist of 4 digits
        int number = 2718;

        // checking whether it's digits are rising or decreasing
        printThere("The digits ");
        print((NumberCheckerLogic.isRising(number)) ? "are rising."
                : (NumberCheckerLogic.isDecreasing(number)) ? "are decreasing."
                : "don't have a strict sequence.");
    }
}

class NumberCheckerLogic {

    public static boolean isRising(int n) {
        n = Math.abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i);
    }

    public static boolean isDecreasing(int n) {
        n = Math.abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i);
    }
}
