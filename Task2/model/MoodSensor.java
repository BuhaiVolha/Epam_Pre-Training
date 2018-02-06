package by.epam_pre_training.task2;

import java.util.Random;

public class MoodSensor {
    private final static int MOOD_NUMBER = 5;

    public static String moodCreator1() {
        String mood = "";

        switch (new Random().nextInt(MOOD_NUMBER)) {
            case 0: mood = "=)"; break;
            case 1: mood = "0_0"; break;
            case 2: mood = ">:/"; break;
            case 3: mood = ";D"; break;
            case 4: mood = ":'["; break;
        }

        return mood;
    }

    public static String moodCreator2() {
        String[] eyes = {"=", ":", ";", "8", ">", ")="};
        String[] nose = {"", "-"};
        String[] mouth = {"3", ")", "/", "O", "P", "(", "D", "C"};

        return "" + eyes[new Random().nextInt(eyes.length)] 
                + nose[new Random().nextInt(nose.length)] 
                + mouth[new Random().nextInt(mouth.length)];
    }
}
