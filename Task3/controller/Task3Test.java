package by.epam_pre_training.task3.controller;

import static by.epam_pre_training.task3.View.*;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;
import by.epam_pre_training.task3.model.*;

public class Task3Test {

    public static void main(String[] args) {

        // Task1
        
        int throwsAmount = 1000;
        int heads = HeadsOrTails.throwCoin(throwsAmount);
        int tails = throwsAmount - heads;

        print("In " + throwsAmount
                + " throws the coin landed "
                + heads + " times on heads and "
                + tails + " times on tails");

        // Task 2.1

        int naturalNumber = 274553981;
        try {
            int largestDigit = TheLargestDigitFinder.findLargestDigit(naturalNumber);

            print("The largest digit in a natural number "
                    + naturalNumber + " is "
                    + largestDigit);
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 2.2

        int number = 612216;

        try {
            print("The number " + number + " is "
                    + ((PalindromeChecker.checkIfPalindrome(number))
                    ? "a palindrome!" : "not a palindrome!"));
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 2.3

        int possiblyPrimeNumber = 27644437;

        try {
            print("The number " + possiblyPrimeNumber + " is "
                    + ((PrimeChecker.checkIfPrime(possiblyPrimeNumber))
                    ? "a prime!" : "not a prime!"));
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 2.4

        int numberToFactorize = 36473826;

        try {
            print("The prime dividers of " + numberToFactorize + " are "
                    + PrimeDividersFinder.findPrimeDividers(numberToFactorize));
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 2.5

        int firstNumber = 25;
        int secondNumber = 10;

        try {
            int gcd = GCDAndLCMFinder.countGreatestCommonDivisor(firstNumber, secondNumber);
            int lcm = GCDAndLCMFinder.countLeastCommonMultiply(firstNumber, secondNumber);

            print("The numbers are " + firstNumber
                    + " and " + secondNumber
                    + ",\nthe greatest common divisor is " + gcd
                    + ",\nthe least common multiply is " + lcm);
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 2.6

        int num = 12665898;
        try {
            print("Your number is " + num
                    + ", the amount of different digits is "
                    + UniqueDigitsCounter.countUniqueDigits(num));
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }

        // Task 3

        int maybePerfectNumber = 8128;
        try {
            boolean isPerfect = PerfectNumberChecker.checkIfPerfect(maybePerfectNumber);

            print("The number " + maybePerfectNumber
                    + " is " + (isPerfect ? "perfect!"
                    : "not perfect!"));
        } catch (NotNaturalNumberException e) {
            print("The number must be larger than 0!");
        }
    }
}
