package main;/*
You have an array of english words {cat, then, hen, end, dog}. Can you make out
if the given sentence is a concatenation of only words from the array?
Cathen valid
thend not valid
cathenend valid
 */

import java.util.HashSet;
import java.util.Set;

public class WordPuzzle {

    private Set<Node> nodes = new HashSet<Node>();

    public void addWord(String word) {
        char[] chars = word.toCharArray();
        int pos = 0;

        for(char c : chars) {
            pos++;
            Node n = new Node(c);
            if(pos == chars.length) {
                n.setWordEnd(true);
            }
            nodes.add(n);
        }
    }

    public void printNodes() {
        System.out.println(nodes);
    }

    public String checkWord(String word) {
        return "valid";
        //return "not valid";
    }

    public static void main(String[] args) {
        WordPuzzle wp = new WordPuzzle();
        wp.addWord("cat");
        wp.addWord("then");
        wp.addWord("hen");
        wp.addWord("end");
        wp.addWord("dog");

        wp.printNodes();

        String[] wordsToCheck = {"cathen", "thend", "cathenend"};
        for(String w : wordsToCheck) {
            System.out.println(w+" "+wp.checkWord(w));
        }
    }

}
