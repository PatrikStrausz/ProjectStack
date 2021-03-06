package sk.itsovy.strausz.stack;

import sk.itsovy.strausz.exeption.OverFlowException;
import sk.itsovy.strausz.exeption.UnderFlowException;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size = 0;
    private int capacity;
    private List<T> list;

    public Stack(int capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
            list = new ArrayList<>();
            System.out.println("Stack was created with size of " +capacity);
        }else{
            System.out.println("Wrong input. Stack was set to default values.");
            this.capacity = 5;
            list = new ArrayList<>();
        }
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T value) {
        try {
            if (value == null)
                return;
            if (!isFull()) {
                list.add(value);
                System.out.println(value + " was added");
                size++;
            } else throw new OverFlowException("The stack is full");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void pop() {

        try {
            if (!isEmpty()) {
                System.out.println(list.get(size-1) +" was deleted. ");
                list.remove(size - 1);
                size--;
            } else throw new UnderFlowException("The stack is empty");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            System.out.println("Top one is: "+list.get(size - 1));
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

    @Override
    public String toString() {
        return  list.toString();
    }
}




