package by.epam_pre_training.task5.generator;

import java.util.Random;

public enum MagicItemTypes {

    BOOK, HERB, POTION, SCROLL;

    private static final MagicItemTypes[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static MagicItemTypes getRandomType() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
