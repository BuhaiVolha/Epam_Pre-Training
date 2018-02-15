package by.epam_pre_training.task4.model;

import static by.epam_pre_training.task4.view.View.*;

public class HanoiTower {

    public static void moveTower(int rings, char source, char receiver, char temp) {

        if (rings != 0) {
            moveTower(rings - 1, source, temp, receiver);
            moveRing(source, receiver);
            moveTower(rings - 1, temp, receiver, source);
        }
    }


    private static void moveRing(char source, char receiver) {

        print(source + "-->" + receiver);
    }
}
