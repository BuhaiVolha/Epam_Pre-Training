package epam_homework.epam1;

import static epam_homework.epam1.Printer.*;
import static epam_homework.epam1.Logic.*;


public class TestTask1 {

    public static void main(String[] args) {

        //1
        int dinoWeight;
        do {
            dinoWeight = inputInt("Введите вес вашего динозавра в граммах");
            if (dinoWeight <= 0) {
                print("Ваш динозавр слишком мелкий!");
            }
        } while (dinoWeight <=0);
        System.out.printf("Это %.5f в килограммах: ", convertToKg(dinoWeight));
        System.out.printf("\nИ %.5f в тонах: ", convertToTones(dinoWeight));

        //2
        int r1;
        int r2;
        do {
            r1 = inputInt("Введите больший радиус");
            r2 = inputInt("Введите меньший радиус");
            if (r1 < r2) {
                print("Первым должен идти больший радиус!");
            }
        } while (r1 < r2);
        System.out.printf("Площадь кольца равна: %.2f\n", getSOfRing(r1,r2));

        //3
        print("Введите два числа и я поменяю их местами!");
        int a = inputInt("Введите первое число");
        int b = inputInt("Введите второе число");
        changePlaces(a, b);

        //4
        int i = inputInt("Введите число, чтобы проверить возрастают или убывают его цифры");
        printThere("Цифры ");
        print((isRising(i)) ? "возрастают" :
                (isDecreasing(i)) ? "убывают" : "не имеют строгой последовательности");

        //5
        int num = inputInt("Введите число для подсчета суммы и произведения его цифр");
        print("Сумма цифр:  " + getSumOfDigits(num));
        print("Произведение цифр:  " + getMultOfDigits(num));

        //6
        int number = inputInt("Введите число для рассчета средне-арифметического" +
                "и средне-геометрического его цифр");
        System.out.printf("Средне-арифметическое равно:  %.2f\n", getArithmeticMean(number));
        System.out.printf("Средне-геометрическое равно:  %.2f", getGeometricMean(number));

        //7
        int numToReverse = inputInt("Введите число, чтобы инверсировать порядок его цифр");
        print("Вот ваше перевернутое число: " + reverseNum(numToReverse));
    }
}

