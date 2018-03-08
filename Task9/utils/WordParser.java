package by.epam_pre_training.task9.utils;

import by.epam_pre_training.task9.entity.Letter;
import by.epam_pre_training.task9.entity.Word;

public class WordParser implements Parsable {
    private String string;
    private Word word;

    public WordParser() {}

    @Override
    public void parse() {
        word = new Word();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            word.addLetter(new Letter(string.substring(i, i + 1)));
        }
    }

    public Word getWord() {
        return word;
    }

    public void setString(String s) {
        this.string = s;
    }
}
