package main;
/*
You have an array of english words {cat, then, hen, end, dog}. Can you make out
if the given sentence is a concatenation of only words from the array?
Cathen valid
thend not valid
cathenend valid
 */

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordPuzzle {

    private TreeSet<String> words = new TreeSet<String>();

    public void addWord(String word) {
        words.add(word);
    }

    public String checkWord(String word) {
        if (!words.isEmpty()) {
            String pattern = "^(";

            for (String p : words.descendingSet()) {
                pattern += p + "|";
            }

            pattern = pattern.substring(0, pattern.length() - 1) + ")+$";
            Matcher m = Pattern.compile(pattern).matcher(word);

            if (m.find()) {
                return "valid";
            }

            return "not valid";
        }

        return "add some words";
    }

    public static void main(String[] args) {
        WordPuzzle wp = new WordPuzzle();
        wp.addWord("cat");
        wp.addWord("then");
        wp.addWord("hen");
        wp.addWord("end");
        wp.addWord("dog");

        String[] wordsToCheck = {"cathen", "thend", "cathenend", "thenhenf"};
        for (String w : wordsToCheck) {
            System.out.println(w + " | " + wp.checkWord(w));
        }
    }

}
