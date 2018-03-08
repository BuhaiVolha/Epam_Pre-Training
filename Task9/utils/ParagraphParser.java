package by.epam_pre_training.task9.utils;

import by.epam_pre_training.task9.entity.Text;

public class ParagraphParser implements Parsable {
    private Text text;
    private final static String REGEXP = "(\\n)";

    @Override
    public void parse() {
        String s = text.toString();
        String[] split = s.split(REGEXP);
        SentenceParser parser = new SentenceParser();
        int length = split.length;

        for (int i = 0; i < length; i++) {
            parser.setString(split[i]);
            parser.parse();
            text.addParagraph(parser.getParagraph());
        }
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }
}
