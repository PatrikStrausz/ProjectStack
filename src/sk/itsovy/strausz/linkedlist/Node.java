package sk.itsovy.strausz.linkedlist;

public class Node<T> {
    private T value;
    private Node next;

    public Node(T name) {
        this.value = name;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}