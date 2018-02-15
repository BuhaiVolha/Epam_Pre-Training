package by.epam_pre_training.task1;

import static by.epam_pre_training.task1.View.print;
import static by.epam_pre_training.task1.View.printThere;

public class TestTask1 {

    public static void main(String[] args) {

        // Task 1

        int dinoWeight = 1_458_000;

        print("Your Dino weights " + dinoWeight + " in grammes");
        System.out.printf("It's %.2f in kilogram", DinoWeightConverter.convertToKg(dinoWeight));
        System.out.printf(", or %.2f in tones.\n", DinoWeightConverter.convertToTones(dinoWeight));

        // Task 2

        double r1 = 11.2;
        double r2 = 35.8;

        print("The radiuses are " + r1 + " and " + r2);
        System.out.printf("The area of a ring equals: %.2f\n",
                RingAreaCalculator.calculateRingArea(r1, r2));

        // Task 3

        int a = 3;
        int b = 14;

        System.out.printf("The first number was %d, and the second was %d.\n", a, b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("Now the first number is %d, and the second is %d.\n", a, b);

        // Task 4

        // the number must consist of 4 digits
        int number4 = 2718;

        print("Your number is " + number4);
        printThere("The digits ");
        print((NumberChecker.checkIfRising(number4)) ? "are rising."
                : (NumberChecker.checkIfDecreasing(number4)) ? "are decreasing."
                : "don't have a strict sequence.");

        // Task 5

        // the number must consist of 5 digits
        int number5 = 27182;

        print("Your number is " + number5);
        print("The sum of digits equals "
                + SumAndMultCalculator.countSumOfDigits(number5));
        print("The multiplication of digits equals "
                + SumAndMultCalculator.countMultOfDigits(number5));

        // Task 6

        // the number must consist of 6 digits
        int number6 = 658432;

        print("Your number is " + number6);
        System.out.printf("The arithmetic mean equals %.2f\n",
                MeanCalculator.getArithmeticMean(number6));
        System.out.printf("The geometric mean equals %.2f\n",
                MeanCalculator.getGeometricMean(number6));

        // Task 6

        // the number must consist of 7 digits
        int numToReverse = 3308161;

        print("Your number was " + numToReverse
                + "\nHere is your reversed number: "
                + NumberReverser.reverseNum(numToReverse));
    }
}
