package by.epam_pre_training.task9.utils;

import by.epam_pre_training.task9.entity.Paragraph;

public class SentenceParser implements Parsable {
    private Paragraph paragraph;
    private String string;
    private final static String REGEXP = "(?<=[.!?:])\\s";

    @Override
    public void parse() {
        paragraph = new Paragraph();
        String[] split = string.split(REGEXP);
        int length = split.length;
        SentencePartsParser parser = new SentencePartsParser();
        
        for (int i = 0; i < length; i++) {
            parser.setString(split[i]);
            parser.parse();
            paragraph.addSentence(parser.getSentence());
        }
    }


    public void setString(String s) {
        this.string = s.trim();
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }
}
