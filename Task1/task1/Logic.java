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
        return s;
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
        boolean isRising = true;
        int digit;

        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            if (n % 10 >= digit) {
                isRising = false;
                break;
            }
        }
        return isRising;
    }

    public static boolean isDecreasing(int n) {
        n = abs(n);
        boolean isDecreasing = true;
        String num = Integer.toString(n);

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) >= num.charAt(i-1)) {
                isDecreasing = false;
                break;
            }
        }
        return isDecreasing;
    }

    public static int getSumOfDigits(int n) {
        n = abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int getMultOfDigits(int n) {
        n = abs(n);
        int mult = 1;

        for ( ; n > 0; n /= 10) {
            mult *= n % 10;
        }
        return mult;
    }

    public static double getArithmeticMean(int n) {
        double sum = (double)getSumOfDigits(n);
        return sum / Integer.toString(n).length();
    }

    public static double getGeometricMean(int n) {
        n = abs(n);
        double mult = 1;
        int digitsCounter = 0;

        while (n > 0) {
            mult *= n % 10;
            n = n / 10;
            digitsCounter++;
        }
        return pow(mult,1/(double)digitsCounter);
    }

    public static int reverseNum(int n) {
        n = abs(n);
        StringBuilder reversed = new StringBuilder( "" + n % 10);
        n = n/10;

        while (n > 0) {
            reversed.append(n % 10);
            n /= 10;
        }
        return Integer.valueOf(reversed.toString());
    }
}
