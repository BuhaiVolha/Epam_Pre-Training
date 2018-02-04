import static Epam_Pre-Training.Task2.Printer.inputInt;
import static Epam_Pre-Training.Task2.Printer.print;

public class DragonHeadsCounter {

    public static void main(String[] args) {
        int age;

        do {
            age = inputInt("How old is the dragon?");
            if (age <= 0) {
                print("The age is wrong!");
            }
        } while (age <= 0);
        
        print("The amount of heads is " + Logic.countHeads(age));
    }
}

class Logic {
    private final static int HEADS_TILL_200 = 3;
    private final static int HEADS_AFTER_200 = 2;

    public static int countHeads(int age) {
        int heads;

        if (age < 200) {
            heads = age * 3;
            
        } else if (age < 300) {
            heads = HEADS_TILL_200 * 200
                    + HEADS_AFTER_200 * (age - 200);
            
        } else {
            heads = HEADS_TILL_200 * 200
                    + HEADS_AFTER_200 * 100
                    + (age - 300);
        }
        return heads;
    }
}
