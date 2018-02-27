package by.epam_pre_training.task5.entity;

import java.util.Objects;

public class Book extends MagicItem {

    private boolean withPictures;

    public Book() {}

    public Book(String name, int magicPower, boolean withPictures) {
        super(name, magicPower);
        this.withPictures = withPictures;
    }
    
    public Book(Book book) {
        this(book.getName(), book.getMagicPower(), book.isWithPictures());
    }

    public boolean isWithPictures() {
        return withPictures;
    }

    public void setWithPictures(boolean withPictures) {
        this.withPictures = withPictures;
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
        Book book = (Book) o;
        return isWithPictures() == book.isWithPictures();
    }

    @Override
    public int hashCode() {
        int prime = 29;
        int result = super.hashCode();
        
        result = (prime * result) + (withPictures ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book, " 
                + super.toString()
                + (withPictures ? ", with pictures"
                : ", without pictures") 
                + ".";
    }
}
