package by.epam_pre_training.task9.model;

import by.epam_pre_training.task9.entity.*;
import java.util.*;

public class Logic {

    public static String removeFirstLetterEveryWhereInTheWord(Text text) {

        for (Paragraph paragraph : text.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                for (SentenceParts sentenceParts : sentence.getSentenceParts()) {
                    if (sentenceParts instanceof Word) {
                        Letter firstLetter = ((Word) sentenceParts).getLetters().get(0);
                        int top = ((Word) sentenceParts).getLetters().size() - 1;

                        for (int i = 1; i < top; i++) {
                            if (((Word) sentenceParts).getLetters().get(i).equals(firstLetter)) {
                                ((Word) sentenceParts).getLetters().remove(i);
                            }
                        }
                        ((Word) sentenceParts).getLetters().remove(firstLetter);
                    }
                }
            }
        }
        return text.build();
    }


    public static String findLongestPalindromeSubstring(Text text) {
        Set<String> list = getListOfWords(text);
        int maxLength = 0;
        String longestPalindromeSubstring = "";
        String stringWithLongestPalindromeSubstring = "";

        for (String s : list) {
            if (s.length() > maxLength) {
                String possiblyLongestPalindromeSubstring = findLongestPalindrome(s);
                int possiblyLongestPalindromeSubstringLength = possiblyLongestPalindromeSubstring.length();

                if (possiblyLongestPalindromeSubstringLength > maxLength) {
                    maxLength = possiblyLongestPalindromeSubstringLength;
                    longestPalindromeSubstring = possiblyLongestPalindromeSubstring;
                    stringWithLongestPalindromeSubstring = s;
                }
            }
        }
        return stringWithLongestPalindromeSubstring
                + " "
                + longestPalindromeSubstring;
    }


    private static Set<String> getListOfWords(Text text) {
        Set<String> list = new LinkedHashSet<>();

        for (Paragraph paragraph : text.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                for (SentenceParts sentenceParts : sentence.getSentenceParts()) {
                    if (sentenceParts instanceof Word) {
                        list.add(sentenceParts.build().toLowerCase());
                    }
                }
            }
        }
        return list;
    }


    private static String findLongestPalindrome(String str) {
        int n = str.length();

        // Table[i][j] will be false if substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        // Check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for lengths greater than 2. k is length of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if ((table[i + 1][j - 1])
                        && (str.charAt(i) == str.charAt(j))) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        return str.substring(start, start + maxLength);
    }
}
