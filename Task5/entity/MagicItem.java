package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class MagicItem implements Comparable<MagicItem> {

    private String name;
    private int magicPower;

    public MagicItem() {}

    public MagicItem(String name, int magicPower) {
        this.name = name;
        this.magicPower = magicPower;
    }
    
    public MagicItem(MagicItem magicItem) {
        this(magicItem.getName(), magicItem.getMagicPower());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        MagicItem magicItem = (MagicItem) o;
        return getMagicPower() == magicItem.getMagicPower() &&
                Objects.equals(getName(), magicItem.getName());
    }

    @Override
    public int hashCode() {
        int prime = 29;
        int result = 17;
        
        result = (prime * result) + (name != null ? name.hashCode() : 0);
        result = (prime * result) + magicPower;
        return result;
    }

    @Override
    public String toString() {
        return "name: "
                + name
                + ", magic power: "
                + magicPower;
    }
    
    @Override
    public int compareTo(MagicItem other) {
        return Integer.compare(this.magicPower, other.getMagicPower());
    }
}
