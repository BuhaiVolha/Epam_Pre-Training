package by.epam_pre_training.task2;

import static by.epam_pre_training.task2.View.print;

public class Task2Test {

    public static void main(String[] args) {
        
        // Task 1
        
        int age = 340;
        int heads = DragonPartsCounter.countHeads(age);
        int eyes = DragonPartsCounter.countEyes(heads);

        print("The age of your dragon is " + age
                + ".\nYour dragon has " + heads
                + " heads and " + eyes + " eyes.");

        // Task 2
        
        char letter = 'u';

        print("The letter " + letter + " is "
                + (LetterDefiner.isConsonant9(letter) ? "consonant!" : "vowel!"));

        // Task 3
        
        print("Your current mood is "
                + MoodSensor.moodCreator1());

        // Task 4
        
        int day = 28;
        int month = 2;
        int year = 2021;

        print("Today is " + day + "." + month + "." + year
                + "\nThe date of the next day is "
                + NextDayDater.getNextDay(day, month, year));

        // Task 5
        
        int a = 111;
        int b = 708;
        int c = 56;
        print("Your number is " + a
                + "\nIt's " + NumbersMaker.convertToWord(a));
        print("Your number is " + b
                + "\nIt's " + NumbersMaker.convertToWord(b));
        print("Your number is " + c
                + "\nIt's " + NumbersMaker.convertToWord(c));

    }
}
