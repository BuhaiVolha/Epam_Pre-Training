package by.epam_pre_training.task9.entity;

public abstract class TextEntity {

    protected String string;
    public abstract String build();

    @Override
    public String toString() {
        return string;
    }
}
