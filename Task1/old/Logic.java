package epam_homework.epam1;

import static java.lang.Math.*;


public class Logic {

    public static double convertToKg(double gr) {
        double kg = gr / 1000;
        return kg;
    }
    public static double convertToTones(double gr) {
        double tones = gr / 1000 / 1000;
        return tones;
    }

    public static double getSOfRing(double r1, double r2) {
        double s = PI * (pow(r1,2) - pow(r2,2));
        return abs(s);
    }

    public static void changePlaces(int a, int b) {
        System.out.printf("Первое число было равно: %d, а второе: %d\n", a, b);
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.printf("Теперь первое число равно: %d, а второе: %d", a, b);
    }

    public static boolean isRising(int n) {
        n = abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i) && s.charAt(i++) < s.charAt(i);
    }

    public static boolean isDecreasing(int n) {
        n = abs(n);
        int i = 0;

        String s = Integer.toString(n);
        return s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i) && s.charAt(i++) > s.charAt(i);
    }

    public static int getSumOfDigits(int n) {
        n = abs(n);

        return n % 10 + (n / 10) % 10 + (n / 100) % 10 + (n / 1000) % 10 + (n / 10_000) % 10;
    }

    public static int getMultOfDigits(int n) {
        n = abs(n);

        return (n % 10 * ((n / 10) % 10) * ((n / 100) % 10) * ((n / 1000) % 10) * ((n / 10_000) % 10));
    }

    public static double getArithmeticMean(int n) {
        n = abs(n);

        double sum = n % 10 + (n / 10) % 10 + (n / 100) % 10 + (n / 1000) % 10
                + (n / 10_000) % 10 + (n / 100_000) % 10;
        return sum/6;
    }

    public static double getGeometricMean(int n) {
        n = abs(n);

        double mult = (n % 10 * ((n / 10) % 10) * ((n / 100) % 10)
                * ((n / 1000) % 10) * ((n / 10_000) % 10) * ((n / 100_000) % 10));
        return pow(mult,1.0/6);
    }

    public static int reverseNum(int n) {
        n = abs(n);

        String s = "" + n % 10 + (n / 10) % 10 + (n / 100) % 10 + (n / 1000) % 10
                + (n / 10_000) % 10 + (n / 100_000) % 10 + (n / 1_000_000) % 10;
        return Integer.parseInt(s);
    }
}
