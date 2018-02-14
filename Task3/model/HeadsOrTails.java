package by.epam_pre_training.task3.model;

import static by.epam_pre_training.task3.validator.Validator.*;
import java.util.Random;

public class HeadsOrTails {

    public static int throwCoin(int throwsAmount) throws throws NotNaturalNumberException {
        
        validate(throwsAmount);
        
        int headsCounter = 0;
        Random rand = new Random();

        for (int i = 0; i < throwsAmount; i++) {
            if (rand.nextBoolean()) {
                headsCounter++;
            }
        }
        return headsCounter;
    }
}
