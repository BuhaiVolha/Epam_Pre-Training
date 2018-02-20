package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Book extends MagicItem {

    private boolean withPictures;

    public Book() {}

    public Book(String name, int magicPower, boolean withPictures) {
        super(name, magicPower);
        this.withPictures = withPictures;
    }

    public boolean isWithPictures() {
        return withPictures;
    }

    public void setWithPictures(boolean withPictures) {
        this.withPictures = withPictures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Book book = (Book) o;
        return isWithPictures() == book.isWithPictures();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), isWithPictures());
    }

    @Override
    public String toString() {
        return "Book, "
                + super.toString()
                + (withPictures
                ? ", with pictures"
                : ", without pictures") +
                ".";
    }
}
