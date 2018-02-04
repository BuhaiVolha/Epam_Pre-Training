import java.util.Random;
import static Epam_Pre-Training.Task2.Printer.print;

public class MoodSensor {

    public static void main(String[] args) {
        print("Your mood is " + MoodSensorLogic.moodCreator1());
    }
}

class MoodSensorLogic {

    public static String moodCreator1() {
        String mood = "";
        int rand = new Random().nextInt(5);

        switch (rand) {
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
