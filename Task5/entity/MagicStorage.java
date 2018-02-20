package by.epam_pre_training.task5.entity;

import by.epam_pre_training.task5.utils.MagicItemCreator;
import by.epam_pre_training.task5.utils.MyList;
import java.util.Objects;

public class MagicStorage {

    private String name;
    private int amountOfItemsInside;
    private MyList<MagicItem> magicStorage;

    public MagicStorage() {}

    public MagicStorage(String name, int amountOfItemsInside) {
        setName(name);
        setAmountOfItemsInside(amountOfItemsInside);
        setMagicStorage(MagicItemCreator.fillStorage(amountOfItemsInside));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfItemsInside() {
        return amountOfItemsInside;
    }

    public void setAmountOfItemsInside(int amountOfItemsInside) {
        this.amountOfItemsInside = amountOfItemsInside;
    }

    public MyList<MagicItem> getMagicStorage() {
        return magicStorage;
    }

    public void setMagicStorage(MyList<MagicItem> magicStorage) {
        this.magicStorage = magicStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MagicStorage)) return false;
        MagicStorage that = (MagicStorage) o;
        return getAmountOfItemsInside() == that.getAmountOfItemsInside() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getMagicStorage(), that.getMagicStorage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAmountOfItemsInside(), getMagicStorage());
    }

    @Override
    public String toString() {
        return "Magic Storage's name: " + name
                + ", consists of " + amountOfItemsInside +
                " items" +
                ".\n";
    }
}
