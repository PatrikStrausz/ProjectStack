package sk.itsovy.strausz.main;

import sk.itsovy.strausz.queue.Queue;
import sk.itsovy.strausz.stack.Stack;

public class Main {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>(3);
//
////        stack.push(2);
////        stack.push(3);
////      stack.topAndPop();
//        System.out.println(stack.toString());
        Queue<Integer> queue = new Queue<>(3);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        System.out.println(queue.toString());
        queue.front();

        queue.frontAndDequeue();


        System.out.println(queue.toString());


    }
}
