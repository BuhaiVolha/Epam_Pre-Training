package by.epam_pre_training.task5.controller;

import static by.epam_pre_training.task5.model.Logic.*;
import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.exceptions.LogicTask5Exception;
import static by.epam_pre_training.task5.utils.MagicItemCreator.*;
import by.epam_pre_training.task5.utils.MyList;
import static by.epam_pre_training.task5.utils.Validator.*;
import static by.epam_pre_training.task5.view.View.*;

public class Task5Test {

    public static void main(String[] args) {

        try {
            String magicStorageName = "Tower of Magi";

            int amountOfItemsInside = 8;
            validateArrayLengthArgument(amountOfItemsInside);

            MyList<MagicItem> items = createMagicItemArray(amountOfItemsInside);
            validateArrayLength(items);

            MagicStorage magicStorage = new MagicStorage(magicStorageName, items);

            print(magicStorage);

            printElementsOfArray(magicStorage.getItems());

            print("\nTotal magic power: " +
                    countTotalMagicPower(magicStorage));
            print("\nThe most powerful item: " +
                    findMostPowerfulItem(magicStorage));

        } catch (LogicTask5Exception e) {
            print(e.getMessage());
        }
    }
}
