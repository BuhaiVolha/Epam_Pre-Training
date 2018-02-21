package by.epam_pre_training.task5.entity;

import by.epam_pre_training.task5.utils.MagicItemCreator;
import by.epam_pre_training.task5.utils.MyList;
import java.util.Objects;

public class MagicStorage {

    private String name;
    private int amountOfItemsInside;
    private MyList<MagicItem> items;

    public MagicStorage() {}

    public MagicStorage(String name, int amountOfItemsInside, MyList<MagicItem> items) {
        setName(name);
        setAmountOfItemsInside(amountOfItemsInside);
        setItems(items);
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

    public MyList<MagicItem> getItems() {
        return items;
    }

    public void setItems(MyList<MagicItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        MagicStorage that = (MagicStorage) o;
        return getAmountOfItemsInside() == that.getAmountOfItemsInside() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getItems(), that.getItems());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAmountOfItemsInside(), getItems());
    }

    @Override
    public String toString() {
        return "Magic Storage's name: " + name
                + ", consists of " + amountOfItemsInside +
                " items" +
                ".\n";
    }
}
