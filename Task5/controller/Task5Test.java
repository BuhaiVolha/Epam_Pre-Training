package by.epam_pre_training.task5.controller;

import static by.epam_pre_training.task5.model.Logic.*;
import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.exceptions.EmptyArrayException;
import by.epam_pre_training.task5.exceptions.IllegalArrayLengthException;
import by.epam_pre_training.task5.generator.MagicItemCreator;
import by.epam_pre_training.task5.container.MyList;
import static by.epam_pre_training.task5.utils.Validator.*;
import static by.epam_pre_training.task5.view.View.*;

public class Task5Test {

    public static void main(String[] args) {

        try {
            String magicStorageName = "Tower of Magi";
            int numberOfItemsInside = 8;
            validateArrayLengthArgument(numberOfItemsInside);

            MagicItemCreator creator = MagicItemCreator.getInstance();
            MyList<MagicItem> items = creator.createMagicItemList(numberOfItemsInside);
            validateArrayLength(items);

            MagicStorage magicStorage = new MagicStorage(magicStorageName, items);
            print(magicStorage);
            printElementsOfArray(magicStorage.getItems());

            print("\nTotal magic power: " +
                    countTotalMagicPower(magicStorage));
            print("\nThe most powerful item: " +
                    findMostPowerfulItem(magicStorage));

        } catch (IllegalArrayLengthException | EmptyArrayException e) {
            print(e.getMessage());
        }
    }
}
