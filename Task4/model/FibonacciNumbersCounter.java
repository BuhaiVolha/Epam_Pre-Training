package by.epam_pre_training.task4.model;

public class FibonacciNumbersCounter {

    public static int countNthFibonacciNumber(int position) {

        return  (position > 2) ? countNthFibonacciNumber(position - 1)
                + countNthFibonacciNumber(position - 2)
                : (position > 0) ? position - 1
                : -1;
    }


    public static int countNthFibonacciNumberIterative(int position) {
        int temp;
        
        if (position > 0) {
            int a = 0;
            int b = 1;

            for (int i = 2; i <= position; i++) {
                temp = a;
                a += b;
                b = temp;

            }
            return a;
        } else {
            return -1;
        }
    }
}
