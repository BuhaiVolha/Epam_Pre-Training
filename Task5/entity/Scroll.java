package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Scroll extends MagicItem {

    private int levelOfSpell;

    public Scroll() {}

    public Scroll(String name, int magicPower, int levelOfSpell) {
        super(name, magicPower);
        this.levelOfSpell = levelOfSpell;
    }
    
    public Scroll(Scroll scroll) {
        this(scroll.getName(), scroll.getMagicPower(), scroll.getLevelOfSpell());
    }

    public int getLevelOfSpell() {
        return levelOfSpell;
    }

    public void setLevelOfSpell(int levelOfSpell) {
        this.levelOfSpell = levelOfSpell;
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
        Scroll scroll = (Scroll) o;
        return getLevelOfSpell() == scroll.getLevelOfSpell();
    }

    @Override
    public int hashCode() {
        int prime = 11;
        int result = super.hashCode();
        
        result = (prime * result) + levelOfSpell;
        return result;
    }

    @Override
    public String toString() {
        return "Scroll, "
                + super.toString()
                + ", level of the spell: "
                + levelOfSpell
                + ".";
    }
}
