package by.epam_pre_training.task3.validator;

import by.epam_pre_training.task3.exceptions.NotNaturalNumberException;

public class Validator {

    public static void validate(int... number) throws NotNaturalNumberException {

        for (int a : number) {
            if (a <= 0) {
                throw new NotNaturalNumberException("The number is not a natural number");
            }
        }
    }
}
