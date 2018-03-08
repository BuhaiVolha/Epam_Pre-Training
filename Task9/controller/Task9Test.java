package by.epam_pre_training.task9.controller;

import by.epam_pre_training.task9.entity.Text;
import by.epam_pre_training.task9.exceptions.Task9Exception;
import by.epam_pre_training.task9.model.Logic;
import by.epam_pre_training.task9.model.TextWorker;
import java.io.File;
import static by.epam_pre_training.task9.view.View.*;

public class Task9Test {

    public static void main(String[] args) {

        // setting path
        String separator = File.separator;
        String path = "D:" + separator + "document.txt";
        
        try {
            // reading a file
            TextWorker textWorker = new TextWorker(path);
            textWorker.readText();

            print("Source text:\n");
            print(textWorker.getText());

            print("Parsing the text and rebuilding it:\n");
            Text text = textWorker.parseText();
            print(textWorker.rebuildText(text));


            // Task 14
            // The longest palindrome substring

            Text task14 = textWorker.parseText();
            String[] result = Logic.findLongestPalindromeSubstring(task14).split(" ");
            print("The word with the longest palindrome substring is "
                    + result[0]
                    + ", the palindrome is "
                    + result[1]
                    + ".");


            // Task 15

            Text task15 = textWorker.parseText();
            print("\nChanging every word by deleting all occurrences of it's first letter in it:\n");
            print(Logic.removeFirstLetterEveryWhereInTheWord(task15));

        } catch (Task9Exception e) {
            print(e.getCause());
            print(e.getMessage());
        }
    }
}
