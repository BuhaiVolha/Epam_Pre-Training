package by.epam_pre_training.task5.model;

import static by.epam_pre_training.task5.view.View.*;
import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.utils.MyList;

public class Logic {

    public static int countTotalMagicPower(MagicStorage storage) {
        MyList<MagicItem> items = getItemsFromStorage(storage);
        int sum = 0;

        for (MagicItem item : items) {
            sum += item.getMagicPower();
        }
        return sum;
    }


    public static MagicItem findMostPowerfulItem(MagicStorage storage) {
        MyList<MagicItem> items = getItemsFromStorage(storage);
        int maxMagicPower = -1;
        MagicItem mostPowerfulItem = null;

        for (MagicItem item : items) {
            if (item.getMagicPower() > maxMagicPower) {
                maxMagicPower = item.getMagicPower();
                mostPowerfulItem = item;
            }
        }
        return mostPowerfulItem;
    }

    public static void showStorageItems(MagicStorage storage) {
        MyList<MagicItem> items = getItemsFromStorage(storage);

        for (MagicItem i : items) {
            print(i);
        }
    }


    private static MyList<MagicItem> getItemsFromStorage(MagicStorage storage) {
        return storage.getMagicStorage();
    }
}
