package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Herb extends MagicItem {

    private int weightInGrams;

    public Herb() {}

    public Herb(String name, int magicPower, int weightInGrams) {
        super(name, magicPower);
        this.weightInGrams = weightInGrams;
    }
    
    public Herb(Herb herb) {
        this(herb.getName(), herb.getMagicPower(), herb.getWeightInGrams());
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
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
        Herb herb = (Herb) o;
        return getWeightInGrams() == herb.getWeightInGrams();
    }

    @Override
    public int hashCode() {
        int prime = 17;
        int result = super.hashCode();
        
        result = (prime * result) + weightInGrams;
        return result;
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
