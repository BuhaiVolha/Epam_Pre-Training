package by.epam_pre_training.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterDefiner {
    private final static String VOWELS = "aeuioy";

    public static boolean checkIfConsonant1(char letter) {
        letter = Character.toLowerCase(letter);
        boolean isConsonant = true;

        switch (letter) {
            case 'a':
            case 'o':
            case 'e':
            case 'u':
            case 'i':
            case 'y': isConsonant = false; break;
        }
        return isConsonant;
    }

    public static boolean checkIfConsonant2(char letter) {
        letter = Character.toLowerCase(letter);

        return  !(letter == 'a'|| letter == 'o' || letter == 'e'
                || letter == 'y' || letter == 'u' || letter == 'i' );
    }

    public static boolean checkIfConsonant3(char letter) {
        letter = Character.toLowerCase(letter);
        boolean isConsonant = true;

        if (letter == 'a') {
            isConsonant = false;
        } else if (letter == 'o') {
            isConsonant = false;
        } else if (letter == 'y') {
            isConsonant = false;
        } else if (letter == 'e') {
            isConsonant = false;
        } else if (letter == 'i') {
            isConsonant = false;
        } else if (letter == 'u') {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean checkIfConsonant4(char letter) {
        letter = Character.toLowerCase(letter);

        return !(VOWELS.contains(Character.toString(letter)));
    }

    public static boolean checkIfConsonant5(char letter) {
        letter = Character.toLowerCase(letter);
        boolean isConsonant = true;

        if (VOWELS.indexOf(letter) != -1) {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean checkIfConsonant6(char letter) {
        letter = Character.toLowerCase(letter);
        boolean isConsonant = true;

        char[] vowels = VOWELS.toCharArray();

        for (char v : vowels) {
            if (letter == v) {
                isConsonant = false;
                break;
            }
        }
        return isConsonant;
    }

    public static boolean checkIfConsonant7(char letter) {
        letter = Character.toLowerCase(letter);

        Pattern p = Pattern.compile("[" + VOWELS + "]");
        Matcher m = p.matcher(Character.toString(letter));

        return !m.matches();
    }

    public static boolean checkIfConsonant8(char letter) {
        letter = Character.toLowerCase(letter);

        for (Vowels v : Vowels.values()) {
            if (v.asChar == letter) {
                return false;
            }
        }
        return true;

    }


    enum Vowels {
        a('a'), y('y'),
        o('o'), i('i'),
        e('e'), u('u');

        private char asChar() {
            return asChar;
        }
        private final char asChar;

        Vowels(char asChar) {
            this.asChar = asChar;
        }
    }
}
