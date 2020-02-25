import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.strausz.linkedlist.MyLinkedList;
import sk.itsovy.strausz.linkedlist.Node;

import java.util.Date;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSize() {
        MyLinkedList list = new MyLinkedList();
        assertEquals(0, list.getSize(), "Has to be 0");
        Node<String> n1 = new Node<>("Test node 1");
        Node<String> n2 = new Node<>("Test node 2");
        Node<String> n3 = new Node<>("Test node 3");
        list.addToFront(n1);
        assertEquals(1, list.getSize(), "Has to be 1");
        list.addToEnd(n2);
        assertEquals(2, list.getSize(), "Has to be 2");
        list.add(1, n3);
        assertEquals(3, list.getSize(), "Has to be 3");
        list.remove(n1);
        assertEquals(2, list.getSize(), "Has to be 2");
        list.removeAll();
        assertEquals(0, list.getSize(), "Has to be 0");

    }

    @Test
    void add() {
        MyLinkedList list = new MyLinkedList();
        Node<String> n1 = new Node<>("Test node 1");
        Node<String> n2 = new Node<>(null);
        Node<Integer> n3 = new Node<>(3);
        Node<String> n4 = new Node<>("");
        Node<Date> n5 = new Node<>(new Date());
        Node<String> n6 = new Node<>("Test node 2");
        Node<Integer> n7 = new Node<>(456);

        assertEquals(0, list.getSize(), "Has to be 0");
        list.addToFront(n1);
        assertNotNull(list.findByValue("Test node 1"));
        assertNull(list.findByValue("Test node 2"));
        list.addToFront(null);
        list.add(1, null);
        list.addToEnd(null);
        assertEquals(1, list.getSize(), "Has to be 1");
        list.addToFront(n2);
        assertEquals(2, list.getSize(), "Has to be 2");
        list.addToFront(n5);
        assertEquals(n5, list.getHead());
        list.addToFront(n6);
        assertNotEquals(n5, list.getHead());

        list.addToEnd(n4);
        list.addToEnd(n7);
        Node tmp = list.getHead();
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        assertEquals(n7, tmp);
        assertNotEquals(n4, tmp);

        Node<String> n10 = new Node<>("Test node 10");
        Node<String> n11 = new Node<>("Test node 11");
        Node<String> n12 = new Node<>("Test node 12");
        Node<String> n13 = new Node<>("Test node 13");
        Node<String> n14 = new Node<>("Test node 14");
        Node<String> n15 = new Node<>("Test node 15");
        Node<String> n16 = new Node<>("Test node 16");

        list.removeAll();
        assertNull(list.getHead());
        list.addToFront(n10);
        list.addToFront(n11);
        list.add(0, n12);
        assertEquals(n12, list.getHead());
        list.add(-1, n13);
        assertEquals(n13, list.getHead());

        list.add(14444, n14);
        tmp = list.getHead();
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        assertEquals(n14, tmp);

        list.add(2, n15);
        assertEquals(n15, list.getHead().getNext().getNext());


    }

    @Test
    void remove() {

        MyLinkedList list = new MyLinkedList();
        Node<String> n1 = new Node<>("Test node 1");
        Node<String> n2 = new Node<>(null);
        Node<Integer> n3 = new Node<>(3);
        Node<String> n4 = new Node<>("");
        Node<Date> n5 = new Node<>(new Date());
        Node<String> n6 = new Node<>("Test node 2");
        Node<Integer> n7 = new Node<>(456);

        list.add(10000, n1);

        list.remove(n1);
        list.remove(n1);
        list.addToFront(n1);
        assertEquals(1, list.getSize());
        list.remove(n1);
        assertEquals(0, list.getSize());
        list.remove(n2);
        assertEquals(0, list.getSize());
        list.addToFront(n3);
        list.addToFront(n4);
        assertEquals(2, list.getSize());
        list.remove(n3);
        list.remove(n3);
        assertEquals(1, list.getSize());
        list.removeAll();
        assertEquals(0, list.getSize());


    }
}