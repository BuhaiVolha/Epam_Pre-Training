import static Epam_Pre-Training.Task2.Printer.inputInt;
import static Epam_Pre-Training.Task2.Printer.print;

public class NumbersMaker {

    public static void main(String[] args) {
        int number;
        boolean isWrong;

        do {
            number = inputInt("Введите натуральное число от 1 до 999:");

            if (number <= 0 || number > 999) {
                print("Число должно находиться в диапазоне от 1 до 999!");
                isWrong = true;
            } else {
                isWrong = false;
            }
        } while (isWrong);

        print(NumbersMakerLogic.convertToWords(number));
    }
}

class NumbersMakerLogic {

    public static String convertToWords(int n) {
        String word = "";
        int hundreds = n / 100;
        int tenth = n / 10 % 10;
        int ones = n % 10;

        switch (hundreds) {
            case 1: word += "сто "; break;
            case 2: word += "двести "; break;
            case 3: word += "триста "; break;
            case 4: word += "четыреста "; break;
            case 5: word += "пятьсот "; break;
            case 6: word += "шестьсот "; break;
            case 7: word += "семьсот "; break;
            case 8: word += "восемьсот "; break;
            case 9: word += "девятьсот "; break;
            default: break;
        }

        switch (tenth) {
            case 1: word += "десять "; break;
            case 2: word += "двадцать "; break;
            case 3: word += "тридцать "; break;
            case 4: word += "сорок "; break;
            case 5: word += "пятьдесят "; break;
            case 6: word += "шестьдесят "; break;
            case 7: word += "семьдесят "; break;
            case 8: word += "восемьдесят "; break;
            case 9: word += "девяносто "; break;
            default: break;
        }

        switch (ones) {
            case 1: word += "один"; break;
            case 2: word += "два"; break;
            case 3: word += "три"; break;
            case 4: word += "четыре"; break;
            case 5: word += "пять"; break;
            case 6: word += "шесть"; break;
            case 7: word += "семь"; break;
            case 8: word += "восемь"; break;
            case 9: word += "девять"; break;
            default: break;
        }

        return word;
    }
}
