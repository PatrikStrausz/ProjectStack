package sk.itsovy.strausz.linkedlist;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void addToFront(Node node) {
        if (node == null) {
            return;
        }

        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }

    }

    public void addToEnd(Node node) {
        if (node == null) {
            return;
        }

        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(node);


    }


    public Node getHead() {
        return head;
    }

    public void add(int position, Node node) {
        if (node == null || head==null) {
            return;
        }
        if (position <= 0) {
            addToFront(node);
        } else if (position >= getSize()) {
            addToEnd(node);
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);

        }


    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }

    }


    public boolean remove(Node node) {
        if (head == null || node == null) {
            return false;
        }
        if (head == node) {
            head = node.getNext();
            return true;
        }
        Node temp = head;
        while (temp.getNext() != node) {
            temp = temp.getNext();
            if (temp == null) {
                return false;
            }

        }
        temp.setNext(temp.getNext().getNext());
        return true;

    }

    public void removeAll() {
        head = null;

    }

    public Node findByValue(String name) {
        if (name == null || head == null) {
            return null;
        }


        Node temp = head;
        if (!(temp.getValue() instanceof String)) {
            return null;
        }
        while (temp != null) {
            if (temp.getValue().equals(name)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }


    public int getSize() {

        Node temp = head;
        if (head == null) {
            return 0;
        }

        int count = 0;
        while (temp != null) {
            temp = temp.getNext();
            count++;
        }
        return count;
    }
}

