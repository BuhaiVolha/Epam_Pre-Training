package by.epam_pre_training.task2;

public class NextDayDater {
    private final static String[] MONTH_NAMES = {"January", "February",
            "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    private static final int[] MONTH_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};

    public static String getNextDay(int day, int month, int year) {

        validateDate(day, month, year);
        if (((month == 2) && (isNonLeapYear(year)) && (day == 28))
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

    private static boolean isNonLeapYear(int year) {

        return !((year % 4 == 0)
                && (year % 100 != 0)
                || (year % 400 == 0));
    }

    private static void validateDate(int day, int month, int year) {

        if ((month < 0) || (month > 12)) {
            throw new IllegalArgumentException("Invalid index of month!");
        }

        if (day > MONTH_DAYS[month - 1]) {
            throw new IllegalArgumentException("Invalid month's length!");
        }

        if ((month == 2) && (isNonLeapYear(year)) && (day == 29)) {
            throw new IllegalArgumentException("The February has 28 days in non-leap years!");
        }

        if (year <= 0) {
            throw new IllegalArgumentException("The year must not be negative or equal to 0!");
        }
    }
}
