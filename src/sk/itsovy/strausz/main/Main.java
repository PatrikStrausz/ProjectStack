package sk.itsovy.strausz.main;

import sk.itsovy.strausz.linkedlist.MyLinkedList;
import sk.itsovy.strausz.linkedlist.Node;

public class Main {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>(3);
//
////        stack.push(2);
////        stack.push(3);
////      stack.topAndPop();
//        System.out.println(stack.toString());
//        Queue<Integer> queue = new Queue<>(3);
//        queue.enqueue(1);
//        queue.enqueue(3);
//        queue.enqueue(2);
//        System.out.println(queue.toString());
//        queue.front();
//
//        queue.frontAndDequeue();
//
//
//        System.out.println(queue.toString());

        MyLinkedList list = new MyLinkedList();
        Node<String> n1 = new Node<>("Filip");
        Node<String> n2 = new Node<>("Eva");
        Node<String> n3 = new Node<>("Jaro");
        list.addToFront(n1);
        list.addToFront(n2);
        list.addToFront(n3);

        Node<String> n4 = new Node<>("Emil");
        Node<String> n5 = new Node<>("Denisa");


        list.addToEnd(n4);
        list.addToEnd(n5);


        Node<String> n6 = new Node<>("Bartolomej");
        list.add(1, n6);

        list.remove(list.findByValue("Emil"));


        list.print();
        System.out.println(list.getSize());


    }
}
