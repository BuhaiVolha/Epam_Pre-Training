package by.epam_pre_training.task5.model;

import by.epam_pre_training.task5.entity.MagicItem;
import by.epam_pre_training.task5.entity.MagicStorage;
import by.epam_pre_training.task5.utils.MyList;
import static by.epam_pre_training.task5.view.View.*;

public class Logic {

    public static int countTotalMagicPower(MagicStorage storage) {
        MyList<MagicItem> items = storage.getMagicStorage();
        int sum = 0;

        for (MagicItem item : items) {
            sum += item.getMagicPower();
        }
        return sum;
    }


    public static MagicItem findMostPowerfulItem(MagicStorage storage) {
        MyList<MagicItem> items = storage.getMagicStorage();
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
        MyList<MagicItem> items = storage.getMagicStorage();

        for (MagicItem i : items) {
            print(i);
        }
    }
}
