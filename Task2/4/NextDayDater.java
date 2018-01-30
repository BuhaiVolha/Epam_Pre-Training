import static Epam_Pre-Training.Task2.Printer.inputInt;
import static Epam_Pre-Training.Task2.Printer.print;

public class NextDayDater {

    public static void main(String[] args) {
        int day, month, year;

        print("Это приложение рассчитывает дату следующего дня.");
        print("!!!Рекомендуемый минимальный год - 1582, иначе\nформула рассчета високосных годов не сработает.\n");

        day = inputInt("Введите число месяца:");
        while (!NextDayDaterLogic.validateDay(day)) {
            print("Минимальное число - 01, максимальное - 31!\n");
            day = inputInt("Введите число месяца:");
        }

        month = inputInt("Введите порядковый номер месяца:");
        while (!NextDayDaterLogic.validateMonth(month)) {
            print("Минимальное число - 01, максимальное - 12!\n");
            month = inputInt("Введите порядковый номер месяца:");
        }
        if (NextDayDaterLogic.isMonthWith30Days(month)) {
            while (day > 30) {
                System.out.printf("В %s-ом месяце всего 30 дней!\n", month);
                day = inputInt("Введите число месяца:");
            }
        }
        if (month == 2) {
            while (day > 29) {
                print("Максиумальное число дней в феврале - 29!\n");
                day = inputInt("Введите число месяца:");
            }
        }

        year = inputInt("Введите год:");
        while (year <= 0) {
            print("Год не может быть отрицательным или равняться нулю!\n");
            year = inputInt("Введите год:");
        }
        if (year < 1582) {
            print("Введенный год меньше 1582!");
            print("Точность рассчета високосности не гарантирована!\n");
        }
        if (!NextDayDaterLogic.isLeapYear(year) && month == 2) {
            while (day > 28) {
                System.out.printf("%s-ый год - невисокосный, 28 дней в феврале!\n", year);
                day = inputInt("Введите число месяца:");
            }
        }

        print("Дата следующего дня: " + NextDayDaterLogic.tellNextDayDate(day, month, year));
    }
}

class NextDayDaterLogic {

    public static String tellNextDayDate(int day, int month, int year) {

        if (day == 29 && isLeapYear(year) ||
            (day == 28 && !isLeapYear(year)) ||
                (day == 31 && !isMonthWith30Days(month) ||
                        (day == 30 && isMonthWith30Days(month)))) {
            day = 1;
            if (month != 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        } else {
            day++;
        }
        String s = (day < 10) ? "0" + day : "" + day;
        s += (month < 10) ? ".0" + month + "." + year + " г."
                : "." + month + "." + year + " г.";
        return s;
    }

    public static boolean validateDay(int day) {
        return day > 0 && day <= 31;
    }

    public static boolean validateMonth(int month) {
        return month > 0 && month <= 12;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isMonthWith30Days(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }
}
