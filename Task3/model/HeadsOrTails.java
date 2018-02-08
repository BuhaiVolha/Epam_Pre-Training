package by.epam_pre_training.task3.model;

import java.util.Random;

public class HeadsOrTails {
    private final static int AMOUNT_OF_THROWS = 1000;
    private final static int SIDES_OF_COINS = 2;

    public static int throwCoin() {
        int headsCounter = 0;

        // 1 - for heads
        for (int i = 0; i < AMOUNT_OF_THROWS; i++) {
            if (new Random().nextInt(SIDES_OF_COINS) == 1) {
                headsCounter++;
            }
        }
        return headsCounter;
    }
}
