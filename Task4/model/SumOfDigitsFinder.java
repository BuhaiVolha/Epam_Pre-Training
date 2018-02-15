package by.epam_pre_training.task4.model;

public class SumOfDigitsFinder {

    public static int findDigitsSumIterative(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public static int findDigitsSumRecursive(int number) {
        number = Math.abs(number);

        return (number != 0)
                ? number % 10 + findDigitsSumRecursive(number / 10)
                : 0;
    }
}
