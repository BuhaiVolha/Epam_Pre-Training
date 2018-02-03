import static epam_Pre-Training.task1.Printer.print;

public class NumberReverser {

    public static void main(String[] args) {
        // the number must consist of 7 digits
        int numToReverse = 3308161;
        
        print("Here is your reversed number "
                + NumberReverserLogic.reverseNum(numToReverse));
    }
}

class NumberReverserLogic {

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
