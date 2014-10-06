package test;

import main.WordPuzzle;

import static org.junit.Assert.*;

public class WordPuzzleTest {

    private WordPuzzle wp;
    private boolean setup = false;

    public void setUp() {
        if(!setup) {
            wp = new WordPuzzle();
            wp.addWord("cat");
            wp.addWord("then");
            wp.addWord("hen");
            wp.addWord("end");
            wp.addWord("dog");
            setup = true;
        }
    }

    @org.junit.Test
    public void testWordPuzzleInstance() throws Exception {
        setUp();
        assertEquals(WordPuzzle.class, wp.getClass());
    }

    @org.junit.Test
    public void testWordPuzzleCathen() throws Exception {
        setUp();
        String exp = "valid";
        String act = wp.checkWord("cathen");
        assertEquals(exp, act);
    }

    @org.junit.Test
    public void testWordPuzzleThend() throws Exception {
        setUp();
        String exp = "not valid";
        String act = wp.checkWord("thend");
        assertEquals(exp, act);
    }

    @org.junit.Test
    public void testWordPuzzleCathenend() throws Exception {
        setUp();
        String exp = "valid";
        String act = wp.checkWord("cathenend");
        assertEquals(exp, act);
    }
}