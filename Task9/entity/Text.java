package by.epam_pre_training.task9.entity;

import java.util.ArrayList;
import java.util.List;

public class Text extends TextEntity {
    private List<Paragraph> paragraphs;

    public Text(String string) {
        paragraphs = new ArrayList<>();
        this.string = string;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    @Override
    public String build() {
        StringBuilder string = new StringBuilder();
        for (Paragraph paragraph : paragraphs) {
            string.append(paragraph.build()).append("\n");
        }
        return new String(string);
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Text other = (Text) obj;
        return this.paragraphs.equals(other.paragraphs);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Paragraph p : paragraphs) {
            hash += hash * 31 + p.hashCode();
        }
        return hash;
    }
}
