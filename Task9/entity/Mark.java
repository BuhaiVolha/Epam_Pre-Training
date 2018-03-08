package by.epam_pre_training.task9.entity;

public class Mark extends SentenceParts {

    public Mark() {}

    public Mark(String string) {
        this.string = string;
    }

    public void setMark(String string) {
        this.string = string;
    }

    public String getMark() {
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mark other = (Mark) obj;
        return this.string.equals(other.string);
    }

    @Override
    public String build() {
        return string;
    }
}
