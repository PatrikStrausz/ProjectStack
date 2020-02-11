package sk.itsovy.strausz.stack;

import sk.itsovy.strausz.exeption.StackOverFlowException;
import sk.itsovy.strausz.exeption.StackUnderFlowException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size = 0;
    private int capacity;
    private List<T> list;

    public Stack(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T value) {

        try {
            if (value == null) return;
            if (!isFull()) {
                list.add(value);
                System.out.println(value + " was added");
                size++;
            } else throw new StackOverFlowException("The stack is full");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void pop() {

        try {
            if (!isEmpty()) {
                list.remove(size - 1);
                size--;
            } else throw new StackUnderFlowException("The stack is empty");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(size - 1);
        }

    }

    public T topAndPop() {
        T temp = top();
        pop();
        return temp;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void empty() {
        list.clear();
        size = 0;
    }
}




