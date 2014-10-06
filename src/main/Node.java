package main;

import java.util.HashSet;

public class Node {

    private Character letter;
    private HashSet<Node> connectedNodes = new HashSet<Node>();
    private boolean wordEnd;

    public Node(char l) {
        letter = l;
    }

    public char getLetter() {
        return letter;
    }

    public void addNode(Node n) {
        connectedNodes.add(n);
    }

    public void removeNode(Node n) {
        connectedNodes.remove(n);
    }

    public HashSet<Node> getNodes() {
        return connectedNodes;
    }

    public void setWordEnd(boolean t) {
        wordEnd = t;
    }

    public boolean getWordEnd() {
        return wordEnd;
    }
}
