package by.epam_pre_training.task5.controller;

import static by.epam_pre_training.task5.model.Logic.*;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.exceptions.Task5Exception;
import static by.epam_pre_training.task5.validator.Validator.*;
import static by.epam_pre_training.task5.view.View.*;

public class Task5Test {

    public static void main(String[] args) {

        try {
            String magicStorageName = "Tower of Magi";
            int amountOfItemsInside = 8;

            validateIfPositive(amountOfItemsInside);

            MagicStorage magicStorage = new MagicStorage(magicStorageName, amountOfItemsInside);
            print(magicStorage.toString());
            printElementsOfArray(getItemsFromStorage(magicStorage));

            print("\nTotal magic power: " +
                    countTotalMagicPower(magicStorage));
            print("\nThe most powerful item: " +
                    findMostPowerfulItem(magicStorage));
        } catch (Task5Exception e) {
            print(e.getMessage());
        }
    }
}
