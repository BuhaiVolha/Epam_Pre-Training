package by.epam_pre_training.task4.model;

public class FibonacciNumbersCounter {

    public static int countNthFibonacciNumber(int position) {

        if (position > 2) {
            return countNthFibonacciNumber(position - 1)
                    + countNthFibonacciNumber(position - 2);
        }
        if (position > 0) {
            return position - 1;
        }
        return -1;
    }


    public static int countNthFibonacciNumberIterative(int position) {

        if (position > 0) {
            int a = 0;
            int b = 1;

            for (int i = 2; i <= position; i++) {
                int temp = a;
                a += b;
                b = temp;

            }
            return a;
        }
        return -1;
    }
}
