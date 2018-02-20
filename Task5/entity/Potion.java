package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Potion extends MagicItem {

    private String color;

    public Potion() {}

    public Potion(String name, int magicPower, String color) {
        super(name, magicPower);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Potion)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Potion potion = (Potion) o;
        return Objects.equals(getColor(), potion.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getColor());
    }

    @Override
    public String toString() {
        return "Potion, "
                + super.toString()
                + ", color: "
                + color
                +".";
    }
}
