package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Potion extends MagicItem {

    private String color;

    public Potion() {}

    public Potion(String name, int magicPower, String color) {
        super(name, magicPower);
        this.color = color;
    }
    
    public Potion(Potion potion) {
        this(potion.getName(), potion.getMagicPower(), potion.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!super.equals(o)) {
            return false;
        }
        Potion potion = (Potion) o;
        return Objects.equals(getColor(), potion.getColor());
    }

    @Override
    public int hashCode() {
        int prime = 13;
        int result = super.hashCode();
        
        result = (prime * result) + (color != null ? color.hashCode() : 0);
        return result;
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
