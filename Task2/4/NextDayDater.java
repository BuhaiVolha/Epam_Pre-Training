import static Epam_Pre-Training.Task2.Printer.inputInt;
import static Epam_Pre-Training.Task2.Printer.print;

public class NextDayDater {

    public static void main(String[] args) {
        int day, month, year;

        print("This application calculates the date of the next day.");
        print("!!!The recommended minimum for a year is 1582, otherwise\n"
              + "leap year calculation formula might not work.\n");

        day = inputInt("Input the day:");
        while (!NextDayDaterLogic.validateDay(day)) {
            print("The minimum input is 01, the maximum one 31!\n");
            day = inputInt("Input the day:");
        }

        month = inputInt("Input the month:");
        while (!NextDayDaterLogic.validateMonth(month)) {
            print("The minimum input is 01, the maximum one 12!\n");
            month = inputInt("Input the month:");
        }
        if (NextDayDaterLogic.isMonthWith30Days(month)) {
            while (day > 30) {
                System.out.printf("This month (%s) has only 30 days!\n", month);
                day = inputInt("Input the month:");
            }
        }
        if (month == 2) {
            while (day > 29) {
                print("The maximum days in February is 29!\n");
                day = inputInt("Input the month:");
            }
        }

        year = inputInt("Input the year:");
        while (year <= 0) {
            print("The year must not be negative or equal to 0!\n");
            year = inputInt("Input the year:");
        }
        if (year < 1582) {
            print("The year is less than 1582!");
            print("The accuracy of leap year calculation is not guaranteed!\n");
        }
        if (!NextDayDaterLogic.isLeapYear(year) && month == 2) {
            while (day > 28) {
                System.out.printf("%s-th year is non-leap, the February has 28 days!\n", year);
                day = inputInt("Input the month:");
            }
        }

        print("The date of the next day is " + NextDayDaterLogic.tellNextDayDate(day, month, year));
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
        
        return String.join(".", day < 10 ? "0" + day : "" + day,
                                month < 10 ? "0" + month : "" + month, 
                                year + " г", "");
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
