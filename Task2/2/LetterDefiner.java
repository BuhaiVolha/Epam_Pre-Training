import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Epam_Pre-Training.Task2.Printer.inputLine;
import static Epam_Pre-Training.Task2.Printer.printThere;
import static Epam_Pre-Training.Task2.Printer.print;

public class LetterDefiner {

    public static void main(String[] args) {

        char letter = inputLine("Введите букву (русскую):").toLowerCase().charAt(0);
        printThere("Ваша буква ");
        print(LetterDefinerLogic.isConsonant8(letter) ? "согласная!" : "гласная!");
    }
}

class LetterDefinerLogic {

    public static boolean isConsonant1(char letter) {
        boolean isConsonant = true;

        switch (letter) {
            case 'а':
            case 'о':
            case 'у':
            case 'э':
            case 'и':
            case 'я':
            case 'ё':
            case 'е':
            case 'ю':
            case 'ы': isConsonant = false; break;
            default: break;
        }
        return isConsonant;
    }

    public static boolean isConsonant2(char letter) {
        boolean isConsonant = true;

        if (letter == 'а'|| letter == 'о' || letter == 'у' || letter == 'э'
                || letter == 'и' || letter == 'я' || letter == 'ё'
                || letter == 'е' || letter == 'ю' || letter == 'ы' ) {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean isConsonant3(char letter) {
        boolean isConsonant = true;

        if (letter == 'а') {
            isConsonant = false;
        } else if (letter == 'о') {
            isConsonant = false;
        } else if (letter == 'у') {
            isConsonant = false;
        } else if (letter == 'э') {
            isConsonant = false;
        } else if (letter == 'и') {
            isConsonant = false;
        } else if (letter == 'я') {
            isConsonant = false;
        } else if (letter == 'ё') {
            isConsonant = false;
        } else if (letter == 'е') {
            isConsonant = false;
        } else if (letter == 'ю') {
            isConsonant = false;
        } else if (letter == 'ы') {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean isConsonant4(char letter) {
        boolean isConsonant = true;

        String vowels = "аоеиыэёуюя";
        if (vowels.contains(Character.toString(letter))) {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean isConsonant5(char letter) {
        boolean isConsonant = true;

        String vowels = "аоеиыэёуюя";
        if (vowels.indexOf(letter) != -1) {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean isConsonant6(char letter) {
        boolean isConsonant = true;
        char[] vowels = {'а','о','е','и','ы','э','ё','у','ю','я'};

        for (char v : vowels) {
            if (letter == v) {
                isConsonant = false;
                break;
            }
        }
        return isConsonant;
    }

    public static boolean isConsonant7(char letter) {
        boolean isConsonant = true;

        Pattern p = Pattern.compile("[аоеиыэёуюя]");
        Matcher m = p.matcher(Character.toString(letter));
        if (m.matches()) {
            isConsonant = false;
        }
        return isConsonant;
    }

    public static boolean isConsonant8(char letter) {

        Constantable c = l -> {
            for (Vowels v : Vowels.values()) {
                if (v.asChar == l) {
                    return false;
                }
            }
            return true;
        };

        boolean isConsonant = c.isConstantable(letter);

        return isConsonant;
    }

    public interface Constantable {
        boolean isConstantable(char l);
    }

    enum Vowels {

        а('a'), о('о'), е('е'),
        и('и'), ы('ы'), э('э'),
        ё('ё'), у('у'), ю('ю'), я('я');

        public char asChar() {
            return asChar;
        }
        private final char asChar;

        private Vowels(char asChar) {
            this.asChar = asChar;
        }
    }
}
