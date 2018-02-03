import static epam_Pre-Training.task1.Printer.print;

public class SumAndMultCalculator {

    public static void main(String[] args) {
        // the number must consist of 5 digits
        int number = 27182;

        print("The sum of digits equals "
                + SumAndMultCalculatorLogic.getSumOfDigits(number));
        print("The multiplication of digits equals "
                + SumAndMultCalculatorLogic.getMultOfDigits(number));
    }
}

class SumAndMultCalculatorLogic {

    public static int getSumOfDigits(int n) {
        n = Math.abs(n);

        return n % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n /= 10) % 10
                + (n / 10) % 10;
    }

    public static int getMultOfDigits(int n) {
        n = Math.abs(n);

        return n % 10
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n /= 10) % 10)
                * ((n / 10) % 10);
    }
}
