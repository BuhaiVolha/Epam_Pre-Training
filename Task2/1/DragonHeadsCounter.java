import static Epam_Pre-Training.Task2.Printer.inputInt;
import static Epam_Pre-Training.Task2.Printer.print;

public class DragonHeadsCounter {

    public static void main(String[] args) {
        int age;

        do {
            age = inputInt("Сколько дракону лет?");
            if (age <= 0) {
                print("Драконы столько не живут!");
            }
        } while (age <= 0);
        print("Количество голов: " + DragonHeadsCounterLogic.countHeads(age));
    }
}

class DragonHeadsCounterLogic {

    public static int countHeads(int age) {
        int heads;

        if (age < 200) {
            heads = age * 3;
        } else if (age < 300) {
            heads = 2 * (age - 200) + 600;
        } else {
            heads = (age - 300) + 800;
        }
        return heads;
    }
}
