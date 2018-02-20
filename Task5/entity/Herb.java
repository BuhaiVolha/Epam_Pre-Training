package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Herb extends MagicItem {

    private int weightInGrams;

    public Herb() {}

    public Herb(String name, int magicPower, int weightInGrams) {
        super(name, magicPower);
        this.weightInGrams = weightInGrams;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Herb)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Herb herb = (Herb) o;
        return getWeightInGrams() == herb.getWeightInGrams();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getWeightInGrams());
    }

    @Override
    public String toString() {
        return "Herb, "
                + super.toString()
                + ", weight: "
                + weightInGrams
                + " grams.";
    }
}
