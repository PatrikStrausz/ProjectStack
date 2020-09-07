package sk.itsovy.strausz.binary.tree;

public class Node {

    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

