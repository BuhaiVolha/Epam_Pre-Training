package by.epam_pre_training.task9.utils;

import by.epam_pre_training.task9.entity.SourceText;
import by.epam_pre_training.task9.entity.Text;

public class TextParser implements Parsable {
    private Text text;
    private SourceText sourceText;

    @Override
    public void parse() {
        text = new Text(sourceText.getSourceText());
        ParagraphParser parser = new ParagraphParser();
        parser.setText(text);
        parser.parse();
    }

    public void setSource(SourceText source) {
        this.sourceText = source;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }
}
