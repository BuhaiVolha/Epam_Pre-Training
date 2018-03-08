package by.epam_pre_training.task9.model;

import by.epam_pre_training.task9.entity.SourceText;
import by.epam_pre_training.task9.entity.Text;
import by.epam_pre_training.task9.exceptions.FileNotFoundException;
import by.epam_pre_training.task9.utils.TextParser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextWorker {

    private String path;
    private SourceText sourceText;
    private Text text;

    public TextWorker(String path) {
        this.path = path;
    }


    public void readText() throws FileNotFoundException {
        StringBuilder stringWithTextFromFile = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String textFromFile;

            while ((textFromFile = bufferedReader.readLine()) != null) {
                stringWithTextFromFile.append(textFromFile).append("\r\n");
            }

        } catch (IOException e) {
            throw new FileNotFoundException("File not found!", e);
        }
        setTexts(new String(stringWithTextFromFile));
    }


    public Text getText() {
        return text;
    }


    private void setTexts(String text) {
        this.sourceText = new SourceText(text, path);
        this.text = new Text(text);
    }


    public String getSourceText() {
        return sourceText.getSourceText();
    }


    public String rebuildText(Text text) {
        return text.build();
    }

    public Text parseText() {
        TextParser parser = new TextParser();
        parser.setSource(sourceText);
        parser.setText(text);
        parser.parse();
        return parser.getText();
    }
}
