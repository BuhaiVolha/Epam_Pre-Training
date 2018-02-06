package by.epam_pre_training.task2;

public class DragonPartsCounter {
    private final static int BABY_DRAGON = 200;
    private final static int MATURE_DRAGON = 300;
    private final static int HEADS_WHEN_BABY = 3;
    private final static int HEADS_WHEN_MATURE = 2;
    private final static int EYES_PER_HEAD = 2;

    public static int countHeads(int age) {
        int heads;

        if (age <= 0) {
            throw new IllegalArgumentException("Wrong age! Your dragon is dead!");

        } else if (age <= BABY_DRAGON) {
            heads = HEADS_WHEN_BABY * age;

        } else if (age <= MATURE_DRAGON) {
            heads = HEADS_WHEN_BABY * BABY_DRAGON
                    - HEADS_WHEN_MATURE * BABY_DRAGON
                    + HEADS_WHEN_MATURE * age;
        } else {
            heads = HEADS_WHEN_BABY * BABY_DRAGON
                    + HEADS_WHEN_MATURE * MATURE_DRAGON
                    - HEADS_WHEN_MATURE * BABY_DRAGON
                    - MATURE_DRAGON + age;
        }
        return heads;
    }

    public static int countEyes(int heads) {

        return EYES_PER_HEAD * heads;
    }
}
