package by.epam_pre_training.task5.entity;

import by.epam_pre_training.task5.container.MyList;
import java.util.Objects;

public class MagicStorage {

    private String name;
    private MyList<MagicItem> items;

    public MagicStorage() {}

    public MagicStorage(String name, MyList<MagicItem> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfItemsInside() {
        return items.size();
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
        return getNumberOfItemsInside() == that.getNumberOfItemsInside() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getItems(), that.getItems());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getNumberOfItemsInside(), getItems());
    }

    @Override
    public String toString() {
        return "Magic Storage's name: " + name
                + ", consists of " + getNumberOfItemsInside() +
                " items" +
                ".\n";
    }
}
