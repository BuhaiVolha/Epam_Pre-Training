import static Epam_Pre-Training.Task2.Printer.print;

public class NextDayDaterWithArrays {

    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2020;

        print("The date of the next day is"
                + NextDayDaterWithArraysLogic.getNextDay(day, month, year));
    }
}

class NextDayDaterWithArraysLogic {

    private final static String[] MONTH_NAMES = {"January", "February",
            "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
            
    private static final int[] MONTH_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};

    public static String getNextDay(int day, int month, int year) {

        NextDayDaterWithArraysLogic.validateDate(day, month, year);
        if (((month == 2) && (!isLeapYear(year)) && (day == 28))
            || (day == MONTH_DAYS[month - 1])) {
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

        return day + " " + MONTH_NAMES[month - 1] + " " + year;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void validateDate(int day, int month, int year) {

        if ((month < 0) || (month > 12)) {
            throw new IllegalArgumentException("Invalid index of month!");
        }

        if (day > MONTH_DAYS[month - 1]) {
            throw new IllegalArgumentException("Invalid length of month!");
        }

        if ((month == 2) && (!isLeapYear(year)) && (day == 29)) {
            throw new IllegalArgumentException("The February has 28 days in non-leap years!");
        }

        if (year <= 0) {
            throw new IllegalArgumentException("The year must not be negative or equal to 0!");
        }
    }
}
