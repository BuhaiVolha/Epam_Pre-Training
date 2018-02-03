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
        System.out.printf("Это %.5f в килограммах", convertToKg(dinoWeight));
        System.out.printf("\nи %.5f в тонах\n", convertToTones(dinoWeight));

        //2
        print("Эта программа рассчитывает площадь кольца");
        int r1 = inputInt("Введите первый радиус");
        int r2 = inputInt("Введите второй радиус");
        System.out.printf("Площадь кольца равна: %.2f\n", getSOfRing(r1,r2));

        //3
        print("Введите два числа и я поменяю их местами!");
        int a = inputInt("Введите первое число");
        int b = inputInt("Введите второе число");
        changePlaces(a, b);

        //4
        int i;
        do {
            i = inputInt("\nВведите четырехзначное число, чтобы проверить возрастают или убывают его цифры");
        } while (Integer.toString(i).length() != 4);
        printThere("Цифры ");
        print((isRising(i)) ? "возрастают" :
                (isDecreasing(i)) ? "убывают" : "не имеют строгой последовательности");

        //5
        int num;
        do {
            num = inputInt("\nВведите пятизначное число для подсчета суммы и произведения его цифр");
        } while (Integer.toString(num).length() != 5);
        print("Сумма цифр:  " + getSumOfDigits(num));
        print("Произведение цифр:  " + getMultOfDigits(num));

        //6
        int number;
        do {
            number = inputInt("\nВведите шестизначное число для рассчета средне-арифметического" +
                    " и средне-геометрического его цифр");
        } while (Integer.toString(number).length() != 6);
        System.out.printf("Средне-арифметическое равно:  %.2f\n", getArithmeticMean(number));
        System.out.printf("Средне-геометрическое равно:  %.2f", getGeometricMean(number));

        //7
        int numToReverse;
        do {
            numToReverse = inputInt("\nВведите семизначное число, чтобы инверсировать порядок его цифр");
        } while (Integer.toString(numToReverse).length() != 7);
        print("Вот ваше перевернутое число: " + reverseNum(numToReverse));
    }
}

