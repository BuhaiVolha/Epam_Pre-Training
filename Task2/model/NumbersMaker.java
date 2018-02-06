package by.epam_pre_training.task2;

public class NumbersMaker {

    public static String convertToWord(int n) {
        final int FIRST_DIGIT = n / 100;
        final int SECOND_DIGIT = (n / 10) % 10;
        final int THIRD_DIGIT = n % 10;

        String firstDigit = "";
        String secondDigit = "";
        String thirdDigit = "";

        if (n <= 0 || n > 999) {
            throw new IllegalArgumentException("The number " +
                    "must be between 1 and 999!");
        }

        if (FIRST_DIGIT != 0) {
            firstDigit = getOnes(FIRST_DIGIT)
                    + ((FIRST_DIGIT == 1) ? " hundred"
                    : " hundreds" );
        }
        
        if (SECOND_DIGIT != 0) {
            secondDigit = (SECOND_DIGIT != 1)
                    ? getTens(SECOND_DIGIT) + " "
                    : getAnotherTens(THIRD_DIGIT);

        }

        if (SECOND_DIGIT != 1) {
            thirdDigit = getOnes(THIRD_DIGIT);
        }
        
        String and = ((FIRST_DIGIT == 0)
                || (SECOND_DIGIT == 0) && (THIRD_DIGIT == 0))
                ? "": " and ";

        return firstDigit + and + secondDigit + thirdDigit;
    }

    private static String getOnes(int n) {
        String word = "";

        switch (n) {
            case 1: word += "one"; break;
            case 2: word += "two"; break;
            case 3: word += "three"; break;
            case 4: word += "four"; break;
            case 5: word += "five"; break;
            case 6: word += "six"; break;
            case 7: word += "seven"; break;
            case 8: word += "eight"; break;
            case 9: word += "nine"; break;
        }
        return word;
    }

    private static String getTens(int n) {
        String word = "";

        switch (n) {
            case 2: word += "twenty"; break;
            case 3: word += "thirty"; break;
            case 4: word += "forty"; break;
            case 5: word += "fifty"; break;
            case 6: word += "sixty"; break;
            case 7: word += "seventy"; break;
            case 8: word += "eighty"; break;
            case 9: word += "ninety"; break;
        }
        return word;
    }

    private static String getAnotherTens(int n) {
        String word = "";

        switch (n) {
            case 1: word += "eleven"; break;
            case 2: word += "twelve"; break;
            case 3: word += "thirteen"; break;
            case 4: word += "fourteen"; break;
            case 5: word += "fifteen"; break;
            case 6: word += "sixteen"; break;
            case 7: word += "seventeen"; break;
            case 8: word += "eighteen"; break;
            case 9: word += "nineteen"; break;
        }
        return word;
    }
}
